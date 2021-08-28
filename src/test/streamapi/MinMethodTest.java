package test.streamapi;

import org.junit.Test;
import streamapi.MinMethod;

import java.util.List;

import static org.junit.Assert.*;

public class MinMethodTest {
    @Test
    public void test() {
        assertEquals(
                "a",
                MinMethod.min(List.of("ccc", "bb", "a"))
        );
    }
}