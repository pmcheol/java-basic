package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        byte[] buffer = new byte[256];
        DatagramPacket packet;

        InetAddress address = InetAddress.getByName("localhost");
        int port = 9998;
        String message = "서버로 보내는 메세지 입니다.";

        buffer = message.getBytes();
        packet = new DatagramPacket(buffer, buffer.length, address, port);
        socket.send(packet);

        buffer = new byte[256];
        packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}
