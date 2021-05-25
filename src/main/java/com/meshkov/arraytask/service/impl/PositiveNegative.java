package com.meshkov.arraytask.service.impl;

import com.meshkov.arraytask.service.Service;

public class PositiveNegative implements Service {
    public int[] getNumOfPositiveAndNegative(int[] array) {
        int[] result = new int[2];

        for (int j : array) {
            if (j < 0) {
                result[1]++;
            } else {
                result[0]++;
            }
        }

        return result;
    }
}
