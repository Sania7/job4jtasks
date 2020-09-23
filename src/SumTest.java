import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void getSum() {
        int[] in = {1, 2, 3, 4, 5, 6};
        int expected = 7;
        int result = Sum.getSum(in);
        assertThat(result, is(expected));
    }
}