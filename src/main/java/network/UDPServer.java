package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);

        byte[] buffer = new byte[256];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);

        System.out.println(new String(packet.getData(), 0, packet.getLength()));

        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String message = String.format("클라이언트로 보내는 메세지 입니다. IP:%s", packet.getAddress().toString());
        byte[] messageBytes = message.getBytes();
        packet = new DatagramPacket(messageBytes, messageBytes.length, address, port);
        socket.send(packet);
    }
}
