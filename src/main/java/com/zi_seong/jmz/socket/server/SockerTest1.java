package com.zi_seong.jmz.socket.server;

import java.net.ServerSocket;

public class SockerTest1 {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server is running on port 8080");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
