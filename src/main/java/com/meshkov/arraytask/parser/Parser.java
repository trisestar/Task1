package com.meshkov.arraytask.parser;

import com.meshkov.arraytask.entity.CustomArray;
import com.meshkov.arraytask.exception.ParseIntException;

import java.util.ArrayList;


public class Parser {


    public static CustomArray findSuitableArray(String str){
        ArrayList<Integer> list = new ArrayList<>();

        str = str.replaceAll("\r","");

        String[] splitted = str.split("\n");

        boolean complited = false;
        for (String string : splitted) {
            if (!complited) {
                complited = true;

                String[] splittedAgain = string.split(" ");

                for (int i = 0; i < splittedAgain.length; i++) {

                    //is it number
                    try {
                        if (!splittedAgain[i].matches("[-+]?\\d+")) {
                            throw new ParseIntException("String contains wrong symbols: " + splittedAgain[i]);
                        }
                    } catch (ParseIntException e) {
                        e.printStackTrace();
                        list.clear();
                        complited = false;
                        break;
                    }

                    list.add(Integer.parseInt(splittedAgain[i]));
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
        return new CustomArray(array);
    }


}
