package jasarsoft;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7633);
            
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            Scanner in = new Scanner(socket.getInputStream());
            
            System.out.println(in.nextLine());
            
            out.println("INSERT 342534 32.23");
            out.flush();
            System.out.println(in.nextLine());
            
            out.println("INSERT 342334 34.63");
            out.flush();
            System.out.println(in.nextLine());
            
            out.println("INSERT 342784 33.53");
            out.flush();
            System.out.println(in.nextLine());
            
            out.println("INSERT 342802 31.33");
            out.flush();
            System.out.println(in.nextLine());
            
            out.println("AVARAGE");
            out.flush();
            System.out.println(in.nextLine());
            
            out.println("EXIT");
            out.flush();
            System.out.println(in.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
