package com.meshkov.arraytask.service.impl;

import com.meshkov.arraytask.service.Service;

public class MinMaxSearch implements Service {

    public int[] getMinMax(int[] array) {
        int[] result = new int[2];
        result[0] = array[0];
        result[1] = array[0];
        for (int i : array) {
            if (i > result[0]) { //result[0] - max element
                result[0] = i;
            } else if (i < result[1]) { //result[1] - min element
                result[1] = i;
            }
        }
        return result;
    }

}
