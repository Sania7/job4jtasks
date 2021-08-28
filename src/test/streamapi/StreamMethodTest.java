package test.streamapi;

import org.junit.Test;
import streamapi.StreamMethod;

import java.util.List;

import static org.junit.Assert.*;

public class StreamMethodTest {
    @Test
    public void whenUserStreamMethod() {
        assertEquals(3, StreamMethod.createStream(
                List.of(1, 2, 3)
        ).count());
    }
}