package com.meshkov.arraytask.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Reader {


    public static String readFile(String input){

        String text = "";

        try {

            text = Files.readString(Paths.get(input));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
