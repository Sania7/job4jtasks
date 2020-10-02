package array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDifferencesTest {

    @Test
    public void sum() {
        assertEquals(9, SumOfDifferences.sum(new int[] {10, 2, 1}));
        assertEquals(2, SumOfDifferences.sum(new int[] {3, 2, 1}));
        assertEquals(5, SumOfDifferences.sum(new int[] {6, 5, 4, 3, 2, 1}));
        assertEquals(4, SumOfDifferences.sum(new int[] {5, 3, 1}));
    }
}