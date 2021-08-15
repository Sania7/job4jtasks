package test.lambda;

import lambda.PredicateCheckEven;
import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckEvenTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }
}