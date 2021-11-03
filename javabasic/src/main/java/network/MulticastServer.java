package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastServer {
    public static void main(String[] args) throws IOException {
        String[] weapons = {"sword", "spear", "dagger", "staff", "bow", "axe", "hammer"};

        MulticastSocket socket = new MulticastSocket();
        byte[] buffer = new byte[256];
        InetAddress group = null;

        try {
            group = InetAddress.getByName("localhost");
            int port = 9997;
            DatagramPacket packet;
            for (String weapon : weapons) {
                buffer = weapon.getBytes();
                packet = new DatagramPacket(buffer, buffer.length, group, port);
                System.out.println("item : " + weapon);
                socket.send(packet);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        socket.close();
    }
}
