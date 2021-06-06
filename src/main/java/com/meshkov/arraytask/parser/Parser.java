package com.meshkov.arraytask.parser;

import com.meshkov.arraytask.entity.CustomArray;
import com.meshkov.arraytask.exception.ParseIntException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;


public class Parser {

    private static final Logger logger = LogManager.getLogger();

    public static CustomArray findSuitableArray(String str){
        ArrayList<Integer> list = new ArrayList<>();

        str = str.replaceAll("\r","");

        String[] splitted = str.split("\n");

        boolean complited = false;
        for (String string : splitted) {
            if (!complited) {
                complited = true;

                String[] splittedAgain = string.split(" ");

                for (String s : splittedAgain) {

                    try {
                        if (!s.matches("[-+]?\\d+")) {
                            throw new ParseIntException("String contains wrong symbols: " + s);
                        }
                    } catch (ParseIntException exception) {
                        exception.printStackTrace();
                        logger.error(exception);
                        list.clear();
                        complited = false;
                        break;
                    }

                    list.add(Integer.parseInt(s));
                }

            } else {
                break;
            }
        }

        int [] array = new int[list.size()];
        for (int i = 0; i< list.size();i++){
            array[i]=list.get(i);
        }
        return new CustomArray(array);
    }


}
