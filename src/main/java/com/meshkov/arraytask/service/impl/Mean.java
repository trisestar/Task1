package com.meshkov.arraytask.service.impl;

import com.meshkov.arraytask.service.Service;

public class Mean implements Service {
    public double getMean(int[] array) {
        double sum = 0;

        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }
}
