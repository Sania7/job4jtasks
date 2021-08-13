package test;

import maphashmap.Farm;
import maphashmap.Farm.Animal;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.Map;

import static org.junit.Assert.*;

public class FarmTest {
    @Test
    public void sumLegs() {
        Map<Animal, Integer> data = Map.of(
                new Animal("chicken", 2), 5,
                new Animal("cow", 4), 2,
                new Animal("pig", 4), 8
        );
        int rsl = Farm.sumLegs(data);
        assertThat(rsl, is(50));
    }
}