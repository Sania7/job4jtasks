package test;

import array.UpperCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperCaseTest {

    @Test
    public void toUpperCase() {
        char[] input = "alpha-123".toCharArray();
        char[] expect = "ALPHA-123".toCharArray();
        Assert.assertArrayEquals(expect, UpperCase.toUpperCase(input));
    }
}
