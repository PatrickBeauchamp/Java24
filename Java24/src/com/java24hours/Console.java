package com.java24hours;

import java.io.*;

public class Console {

    public static String readLine() {
        StringBuilder response = new StringBuilder();
        try {
            BufferedInputStream bin = new BufferedInputStream(System.in);
            int in = 0;
            char inChar;
            do {
                in = bin.read();
                inChar = (char) in;
                if (in != -1) {
                    response.append(inChar);
                }
            } while ((in != -1) && (inChar != '\n'));
            bin.close();
            return response.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("You are standing at the end of the road.");
        System.out.println("Before a small brick building.");
        System.out.println("Around you is a forest.");
        System.out.println("A small stream flows out of the building and down a gully.");
        System.out.print("What do you want to do next?  >");
        String input = Console.readLine();
        System.out.println("Next you will " + input);
    }
}
