package com.studyjava.socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try(DatagramSocket socket = new DatagramSocket();
            Scanner sc = new Scanner(System.in)){
            while (true){
                String str = sc.nextLine();
                byte[] data = str.getBytes();
                InetAddress address = InetAddress.getByName("localhost");
                DatagramPacket packet = new DatagramPacket(data, data.length, address, 8080);
                socket.send(packet);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
