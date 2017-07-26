package ru.geekbrains.chat.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 * Created by HP on 21.07.2017.
 */
public class ServerMain {

    public static void main(String[] args) {
        //create an sever and client sockets
        Vector<ClientHandler> clients;
        Socket clientSocket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Server is started. Waiting for connection....");
            while (true) {
                clientSocket = serverSocket.accept();
                System.out.println("Client is connected");
                new ClientHandler(clientSocket);
            }
        } catch (IOException | NoSuchElementException e) {
            System.out.println("Server initialization failed");
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
