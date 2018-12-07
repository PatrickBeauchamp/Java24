package com.java24hours;

import java.io.*;

public class ID3Reader {

    public static void main(String[] args) {
        File song = new File("C:\\Users\\patty\\Downloads\\Yaka-anima_-_05_-_Mint_Tea_in_Sabilas_Garden.mp3");
        try (FileInputStream file = new FileInputStream(song)) {
            int size = (int) song.length();
            file.skip(size - 128);
            byte[] last128 = new byte[128];
            file.read(last128);
            String id3 = new String(last128);
            String tag = id3.substring(0,3);
            if (tag.equals("TAG")) {
                System.out.println(id3.substring(3));
            } else{
                System.out.println(" does not contain ID3 info...");
            }
            file.close();
        }catch(IOException e){
            System.out.println("Error" +e.toString());
        }
    }
}
