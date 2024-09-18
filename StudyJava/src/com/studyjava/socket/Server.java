package com.studyjava.socket;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)){
            Socket socket = serverSocket.accept();
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            String html = """
                    <!DOCTYPE html>
                    <html lang = "en">
                    <html>
                        <head>
                            <title>Hello World</title>
                        </head>
                        <body>
                            <h1>Hello World</h1>
                        </body>
                    </html>
                    """;
            writer.write("HTTP/1.1 200 OK\r\n");
            writer.write("Content-Type: text/html\r\n");
            writer.write("\r\n");
            writer.write(html);
            writer.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
