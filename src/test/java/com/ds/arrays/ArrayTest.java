package com.ds.arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
    
    Array a;

    @Before
    public void initArray() {
        a= new Array();
        assertNotNull(a);
    }

    @Test
    public void testAdd() {
        for (int i=0; i<20; i++) {
            a.add(i);
            assertEquals(i+1, a.size());
        }
        assertEquals(20, a.size());
    }

    @Test
    public void testRemove() {
        for (int i=0; i<20; i++) {
            a.add(i);
            assertEquals(i+1, a.size());
        }
        assertEquals(20, a.size());
        a.remove(20);
        assertEquals(20, a.size());
        a.remove(19);
        assertEquals(19, a.size());
    }
}