package com.meshkov.arraytask.service.impl;

import com.meshkov.arraytask.entity.CustomArray;
import com.meshkov.arraytask.service.Service;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ServiceImpl implements Service {

    public CustomArray allZerosToMinusOne(CustomArray input) {
        int[] array = input.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = -1;
            }
        }
        return new CustomArray(array);
    }

    public double averageValue(CustomArray input) {
        int[] array = input.getArray();
        double sum = 0;

        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    public int minValue(CustomArray input) {
        int[] array = input.getArray();
        int result = array[0];

        for (int i : array) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }

    public int maxValue(CustomArray input) {
        int[] array = input.getArray();
        int result = array[0];

        for (int i : array) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

    public int numOfPositive(CustomArray input) {
        int[] array = input.getArray();
        int result = 0;

        for (int j : array) {
            if (j > 0) {
                result++;
            }
        }

        return result;
    }

    public int numOfNegative(CustomArray input) {
        int[] array = input.getArray();
        int result = 0;

        for (int j : array) {
            if (j < 0) {
                result++;
            }
        }

        return result;
    }

    public int sum(CustomArray input) {
        int[] array = input.getArray();
        int sum = 0;

        for (int j : array) {
            sum += j;
        }

        return sum;
    }

    public int sumStream(CustomArray customArray){
        IntStream intStream = Arrays.stream(customArray.getArray());
        return intStream.sum();
    }

    public double averageValueStream(CustomArray customArray){
        IntStream intStream = Arrays.stream(customArray.getArray());
        return intStream.average().getAsDouble();
    }

    public int findMinStream (CustomArray customArray){
        IntStream intStream = Arrays.stream(customArray.getArray());
        return intStream.min().getAsInt();
    }

    public int findMaxStream (CustomArray customArray){
        IntStream intStream = Arrays.stream(customArray.getArray());
        return intStream.max().getAsInt();
    }

    public int findNumOfNegativeStream (CustomArray customArray){
        IntStream intStream = Arrays.stream(customArray.getArray());
        return (int) intStream.filter(x -> x<0).count();
    }

    public int findNumOfPositiveStream (CustomArray customArray){
        IntStream intStream = Arrays.stream(customArray.getArray());
        return (int) intStream.filter(x -> x>0).count();
    }

    public int[] zerosToMinusOneStream (CustomArray customArray){
        IntStream intStream = Arrays.stream(customArray.getArray());
        return intStream.map(x -> x == 0 ? x =-1 : x).toArray();
    }
}
