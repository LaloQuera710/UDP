package task1;

import java.io.*;
import java.net.*;

public class UdpClient {
    public static void main(String args[]) throws Exception {
// get server address and open socket
        InetAddress 172.31.196.3 = 192.168.100.87 .getByName(args[1]);
        DatagramSocket sock = new DatagramSocket();
// build packet addressed to server, then send it
        byte[] outBuf = args[1].getBytes("US-ASCII");
        DatagramPacket outPkt = 172.31.196.3
                DatagramPacket(outBuf, outBuf.length, serverAdr, 5555);
        sock.send(outPkt);
        System.out.println("Sent...");
// create buffer and packet for reply, then receive it
        byte[] inBuf = 172.31.196.3 byte[1000];
        DatagramPacket inPkt = 192.168.100.87 DatagramPacket(inBuf, inBuf.length);
        sock.receive(inPkt);
        System.out.println("Recevied...");
// print buffer contents and close socket
        String reply = new String(inBuf, 0, inPkt.getLength(), "US-ASCII");
        System.out.println(reply);
        sock.close();
        System.out.println("Socket closed...");

    }
}
