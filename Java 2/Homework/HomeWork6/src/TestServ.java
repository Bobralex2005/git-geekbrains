import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Alexander Bugaev on 24.07.2017.
 */
public class TestServ {
    public static void main(String[] args) {
        try {
            Scanner console = new Scanner(System.in);
            ServerSocket serverSocket = new ServerSocket(8189);
            System.out.println("Server is started. Waiting connection....");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        System.out.println("Enter your message");
                        String str = console.nextLine();
                        System.out.println("Please enter your message");
                        out.println(str);
                        System.out.println("Answer of client:");
                        str = in.nextLine();
                        System.out.println(str);
                    }
                }
            }).start();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
