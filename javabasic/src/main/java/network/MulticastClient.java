package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastClient {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int MAX = 7;
        int port = 9997;
        MulticastSocket socket = new MulticastSocket(port);
        DatagramPacket packet;

        InetAddress address = InetAddress.getByName("localhost");
        socket.joinGroup(address);

        while (true) {
            System.out.println(">>" + address);
            byte[] buffer = new byte[256];
            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            System.out.println("RECEIVE : " + new String(packet.getData(), 0, packet.getLength()));
            if (count++ == MAX)
                break;
        }

        socket.leaveGroup(address);
        socket.close();
    }
}
