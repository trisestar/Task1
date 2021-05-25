package com.meshkov.arraytask.service.impl;

import com.meshkov.arraytask.service.Service;

public class AllZerosToMinusOne implements Service {

    public int[] changeZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = -1;
            }
        }
        return array;
    }
}
