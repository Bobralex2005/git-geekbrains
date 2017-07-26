import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by HP on 24.07.2017.
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8189);
            Scanner console = new Scanner(System.in);
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
                        System.out.println("Answer of server");
                        str = in.nextLine();
                        System.out.println(str);
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
