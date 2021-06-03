package com.meshkov.arraytask.service;

import com.meshkov.arraytask.entity.CustomArray;

public interface Service {

    CustomArray allZerosToMinusOne(CustomArray input);

    double averageValue(CustomArray input);

    int minValue(CustomArray input);

    int maxValue(CustomArray input);

    int numOfPositive(CustomArray input);

    int numOfNegative(CustomArray input);

    int sum(CustomArray input);

    int sumStream(CustomArray customArray);

    double averageValueStream(CustomArray customArray);

    int findMinStream(CustomArray customArray);

    int findMaxStream(CustomArray customArray);

    int findNumOfNegativeStream(CustomArray customArray);

    int findNumOfPositiveStream(CustomArray customArray);

    int[] zerosToMinusOneStream(CustomArray customArray);
}
