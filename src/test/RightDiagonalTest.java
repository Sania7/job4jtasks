package test;

import array.RightDiagonal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RightDiagonalTest {

    @Test
    public void diagonal() {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] expected = {3, 5, 7};
        Assert.assertArrayEquals(expected, RightDiagonal.diagonal(data));
    }
}