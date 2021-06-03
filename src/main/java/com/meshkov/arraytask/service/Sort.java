package com.meshkov.arraytask.service;

import com.meshkov.arraytask.entity.CustomArray;

public interface Sort {

    CustomArray bubbleSort(CustomArray input);

    CustomArray insertionSort(CustomArray input);

    CustomArray shuttleSort(CustomArray input);

     CustomArray streamSort(CustomArray input);
}
