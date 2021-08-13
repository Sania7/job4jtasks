package test.sort;

import org.junit.Test;
import sort.ReverseOrder;

import java.util.Comparator;

import static org.junit.Assert.*;

public class ReverseOrderTest {
    @Test
    public void test() {
        assertEquals(Comparator.reverseOrder(), ReverseOrder.reverseOrder());
    }
}