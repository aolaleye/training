package com.synechron.checkedexceptiondemo.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderTest {

    public static void main(String[] args) throws IOException {

        try {
            FileReader file = new FileReader("c:\\test\\a.txt");
            BufferedReader fileInput = new BufferedReader(file);
            
            for (int counter = 0; counter < 4; counter++) {
                System.out.println(fileInput.readLine());
            }
            
            fileInput.close();
        }
        
        catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }

}

