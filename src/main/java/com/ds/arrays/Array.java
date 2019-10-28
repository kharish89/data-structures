package com.ds.arrays;

import java.util.Iterator;

public class Array implements Iterable {
    
    int currentSize = 0;
    int actualSize = 5;
    int arr[];

    public Array () {
        arr = new int[actualSize];
    }

    public void add(int val) {
        if (actualSize - currentSize <= 0) {
            actualSize = 2*actualSize;
            int newarr[] = new int[actualSize];
            for (int i=0; i<arr.length; i++) {
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
        arr[currentSize] = val;
        currentSize++;
    }

    public int size() {
        return this.currentSize;
    }

    public void remove(int val) {
        if (currentSize > 0) {
            boolean found = false;
            for (int i=0,j=0; j<arr.length;) {
                if (arr[j] != val) {
                    arr[i++] = arr[j++];
                } else if(!found) {
                    j++;
                    currentSize--;
                    found = true;
                }
                
            }
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}