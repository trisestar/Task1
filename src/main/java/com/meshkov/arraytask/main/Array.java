package com.meshkov.arraytask.main;

public class Array {

    private int[] array;

    public Array(int... arr) {
        this.array = arr;
    }

    public Array() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int... arr) {
        this.array = arr;
    }


}
