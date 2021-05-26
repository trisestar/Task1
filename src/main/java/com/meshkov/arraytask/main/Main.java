package com.meshkov.arraytask.main;

import com.meshkov.arraytask.exception.ParseIntException;
import com.meshkov.arraytask.fileio.ArrayFromFile;
import com.meshkov.arraytask.service.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws ParseIntException, IOException {

        ArrayFromFile arrayFromFile = new ArrayFromFile();
        Array array = new Array(arrayFromFile.getArrayFromFile());

        logger.info("Initial array");
        logger.info("------");
        for (int i : array.getArray()) {
            logger.info(i);
        }
        logger.info("------");

        //minmax
        MinMaxSearch minmax = new MinMaxSearch();
        int[] result = minmax.getMinMax(array.getArray());
        logger.info("Max element = " + result[0]);
        logger.info("Min element = " + result[1]);

        //all 0 to -1
        AllZerosToMinusOne allZerosToMinusOne = new AllZerosToMinusOne();
        result = allZerosToMinusOne.changeZeros(array.getArray());
        array.setArray(result);
        logger.info("0 to -1 completed, new array:");
        logger.info("------");
        for (int i : array.getArray()) {
            logger.info(i);
        }
        logger.info("------");

        //mean
        Mean mean = new Mean();
        double meanValue = mean.getMean(array.getArray());
        logger.info("Mean = " + meanValue);

        //sum
        Sum sum = new Sum();
        int sumValue = sum.getSum(array.getArray());
        logger.info("Sum = " + sum);

        //number of positive and negative elements
        PositiveNegative positiveNegative = new PositiveNegative();
        result = positiveNegative.getNumOfPositiveAndNegative(array.getArray());
        logger.info("Number of positive = " + result[0]);
        logger.info("Number of negative = " + result[1]);

    }
}
