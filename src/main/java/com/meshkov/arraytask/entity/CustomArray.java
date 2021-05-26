package com.meshkov.arraytask.entity;

import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray(int... arr) {
        this.array = arr;
    }

    public CustomArray() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int... arr) {
        this.array = arr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
