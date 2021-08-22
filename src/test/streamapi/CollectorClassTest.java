package test.streamapi;

import org.junit.Test;
import streamapi.CollectorClass;

import java.util.List;

import static org.junit.Assert.*;

public class CollectorClassTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                CollectorClass.collect(List.of(1, 2, 3))
        );
    }
}