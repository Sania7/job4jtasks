package test.sort;

import org.junit.Assert;
import org.junit.Test;
import sort.ArraysSortWithObject;

public class ArraysSortWithObjectTest {
    @Test
    public void test() {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject.sort(input);
        String[] expect = {"c", "b", "a"};
        Assert.assertArrayEquals(expect, result);
    }
}