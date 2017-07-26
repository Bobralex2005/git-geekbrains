import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by HP on 23.07.2017.
 */
public class Client {

    final String IP_ADDRESS = "localhost";
    final int PORT = 8189;
    Socket socket;
    Scanner in;
    Scanner cnl;
    PrintWriter out;

    public static void main(String[] args) {
        Client cl = new Client();
        try {
            cl.socket = new Socket(cl.IP_ADDRESS, cl.PORT);
            cl.cnl = new Scanner(System.in);
            cl.in = new Scanner(cl.socket.getInputStream());
            cl.out = new PrintWriter(cl.socket.getOutputStream());
            while (true) {
                System.out.println("Enter your message");
                String str = cl.cnl.nextLine();
                if (str.equals("/server_closed")) break;
                cl.out.println(str);
                str = cl.in.nextLine();
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
