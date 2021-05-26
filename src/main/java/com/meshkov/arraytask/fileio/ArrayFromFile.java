package com.meshkov.arraytask.fileio;

import com.meshkov.arraytask.exception.ParseIntException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFromFile {


    public int[] getArrayFromFile() throws IOException, ParseIntException {

        ArrayList<Integer> list = new ArrayList<>();
        char[] fileBuf = new char[256];

        //получаем данные из файла
        try (FileReader reader = new FileReader("C:\\Users\\a21pl\\IdeaProjects\\Task1\\src\\main\\resources\\array.txt")) {

            int c;

            while ((c = reader.read(fileBuf)) > 0) {
                if (c < 256) {
                    fileBuf = Arrays.copyOf(fileBuf, c);
                }
            }
        }

        //convert to string
        String str = "";
        for (char character : fileBuf) {
            str += character;
        }
        str = str.replaceAll("\r","");
        //split strings
        String[] splited = str.split("\n");

        //split numbers and add to list
        boolean complited = false;
        for (String string : splited) {
            if (!complited) {
                complited = true;

                String[] splitedAgain = string.split(" ");

                for (int i = 0; i < splitedAgain.length; i++) {

                    //is it number
                    try {
                        if (!splitedAgain[i].matches("[-+]?\\d+")) {
                            throw new ParseIntException("String contains wrong symbols: " + splitedAgain[i]);
                        }
                    } catch (ParseIntException e) {
                        e.printStackTrace();
                        list.clear();
                        complited = false;
                        break;
                    }

                    list.add(Integer.parseInt(splitedAgain[i]));
                }

            } else {
                break;
            }
        }

        //convert list to array
        int [] array = new int[list.size()];
        for (int i = 0; i< list.size();i++){
            array[i]=list.get(i);
        }

        return array;
    }
}
