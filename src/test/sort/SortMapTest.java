package test.sort;

import org.junit.Assert;
import org.junit.Test;
import sort.SortMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class SortMapTest {
    @Test
    public void test() {
        Map<Integer, String> input = Map.of(
                1, "1",
                2, "2",
                3, "3"
        );
        Map<Integer, String> expect = new TreeMap<>(Comparator.reverseOrder());
        expect.putAll(input);
        Map<Integer, String> result = SortMap.sort(input);
        Assert.assertEquals(expect, result);
    }
}