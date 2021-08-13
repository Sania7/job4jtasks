package test.sort;

import org.junit.Test;
import sort.NaturalOrder;

import java.util.Comparator;

import static org.junit.Assert.*;

public class NaturalOrderTest {
    @Test
    public void test() {
        assertEquals(Comparator.naturalOrder(), NaturalOrder.naturalOrder());
    }
}