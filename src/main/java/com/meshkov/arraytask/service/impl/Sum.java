package com.meshkov.arraytask.service.impl;

import com.meshkov.arraytask.service.Service;

public class Sum implements Service {
    public int getSum(int[] array) {
        int sum = 0;

        for (int j : array) {
            sum += j;
        }

        return sum;
    }
}
