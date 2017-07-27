import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test_when_input_is_1() throws Exception {
        assertEquals("1", fizzBuzz.fizzbuzz(1));
    }

    @Test
    public void test_when_input_is_2() throws Exception {
        assertEquals("2", fizzBuzz.fizzbuzz(2));
    }

    @Test
    public void test_when_input_is_3() throws Exception {
        assertEquals("Fizz", fizzBuzz.fizzbuzz(3));
    }

    @Test
    public void test_when_input_is_5() throws Exception {
        assertEquals("Buzz", fizzBuzz.fizzbuzz(5));
    }

    @Test
    public void test_when_input_is_15() throws Exception {
        assertEquals("FizzBuzz", fizzBuzz.fizzbuzz(15));
    }

    @Test
    public void test_when_input_is_25() throws Exception {
        assertEquals("Buzz", fizzBuzz.fizzbuzz(25));
    }

    @Test
    public void test_when_input_is_45() throws Exception {
        assertEquals("FizzBuzz", fizzBuzz.fizzbuzz(45));
    }
}
