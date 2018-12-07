package com.java24hours;

import java.io.*;
import java.util.*;

public class Configurator{
    public Configurator(){
        try{
            File configFile = new File("program.properties");
            FileInputStream inputStream = new FileInputStream(configFile);
            Properties config = new Properties();
            config.load(inputStream);
            Date current = new Date();
            config.setProperty("runtime", current.toString());
            FileOutputStream outputStream= new FileOutputStream(configFile);
            config.store(outputStream, "Properties settings");
            inputStream.close();
            config.list(System.out);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Configurator cf = new Configurator();
    }
}