package com.meshkov.arraytask.service.impl;

import com.meshkov.arraytask.entity.CustomArray;
import com.meshkov.arraytask.service.Service;

import java.util.Arrays;

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


}
