import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void initialize() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldProcessSingleNumber() {
        assertEquals("1", fizzBuzz.process(1));
        assertEquals("2", fizzBuzz.process(2));
    }

    @Test
    public void shouldReturnFizzWithNumberDivisibleByThree() {
        assertEquals("Fizz", fizzBuzz.process(3));
        assertEquals("Fizz",fizzBuzz.process(33));
    }

    @Test
    public void shouldReturnBuzzWithNumberDivisibleByFive(){
        assertEquals("Buzz",fizzBuzz.process(5));
        assertEquals("Buzz",fizzBuzz.process(65));
    }

    @Test
    public void shouldReturnFizzBuzzWithNumberDivisibleByBothFiveAndThree(){
        assertEquals("FizzBuzz",fizzBuzz.process(15));
        assertEquals("FizzBuzz",fizzBuzz.process(60));
    }
}