import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by HP on 23.07.2017.
 */
public class server {
    public static void main(String[] args) {
        //create an sever and client sockets
        Socket clientSocket = null;
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Server is started. Waiting for connection....");
            clientSocket = serverSocket.accept();
            System.out.println("Client is connected");
            Scanner in = new Scanner(clientSocket.getInputStream());
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            while (true) {
                String str = in.nextLine();
                if (str.equals("/end")) {
                    out.println("Server is closed\nBye-Bye!");
                    out.println("/server_closed");
                    break;
                }
                System.out.println("Client: " + str);
                out.println("Echo: " + str);
            }
        } catch (IOException e) {
            System.out.println("Server initialization failed");
        }
    }
}

