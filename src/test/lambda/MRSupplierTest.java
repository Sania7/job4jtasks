package test.lambda;

import lambda.MRSupplier;
import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.*;

public class MRSupplierTest {
    @Test
    public void test() {
        Supplier<String> supplier = MRSupplier.supplier();
        assertEquals("", supplier.get());
    }
}