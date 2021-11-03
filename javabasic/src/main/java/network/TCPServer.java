package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        try {
            server = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Socket socket = null;
        try {
            socket = server.accept();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer.println("클라이언트로 보내는 메세지!");

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        writer.close();
        reader.close();
        socket.close();
        server.close();
    }
}
