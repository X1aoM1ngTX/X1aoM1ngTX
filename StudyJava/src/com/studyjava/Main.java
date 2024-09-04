package com.studyjava;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("G:/Z/Apex Legends/2024-07-18_13-27-40.mkv");
        try (FileInputStream in = new FileInputStream(file);
        FileOutputStream out = new FileOutputStream("ApexLegends.mp4")) {
            byte[] buffer = new byte[128];
            int len;
            long total = file.length(), sum = 0;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
                sum += len;
                System.out.println("已下载：" + (sum * 100 / total) + "%");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

