package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 9999);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer.println("서버로 보내는 메세지. IP : " + socket.getInetAddress().toString());

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        writer.close();
        reader.close();
        socket.close();
    }
}
