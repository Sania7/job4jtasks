package test.streamapi;

import org.junit.Test;
import streamapi.ArraysStreamMethod;

import static org.junit.Assert.*;

public class ArraysStreamMethodTest {
    @Test
    public void test() {
        Integer[] data = {1, 2, 3};
        assertEquals(3, ArraysStreamMethod.createStream(data).count());
    }
}