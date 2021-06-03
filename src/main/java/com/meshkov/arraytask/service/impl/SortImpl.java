package com.meshkov.arraytask.service.impl;

import com.meshkov.arraytask.entity.CustomArray;
import com.meshkov.arraytask.service.Sort;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class SortImpl implements Sort {

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public CustomArray bubbleSort(CustomArray input){
        int[] array = input.getArray();
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return new CustomArray(array);
    }

    public CustomArray insertionSort(CustomArray input){
        int[] array = input.getArray();
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int currentElement = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > currentElement) {
                array[j] = array[j - 1];
                --j;
            }
            array[j] = currentElement;
        }
        return new CustomArray(array);
    }

    public CustomArray shuttleSort(CustomArray input){
        int[] array = input.getArray();
        int n = array.length;

        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (array[z] < array[z - 1]) {
                        swap(array, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return new CustomArray(array);
    }

    public CustomArray streamSort(CustomArray input){

        int[] array = input.getArray();
        IntStream intStream = Arrays.stream(array);
        array = intStream.sorted().toArray();
        return new CustomArray(array);

    }


}
