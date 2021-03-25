import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void initialize() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldProcessSingleNumber() {
        assertEquals("1", fizzBuzz.process(1));
        assertEquals("2", fizzBuzz.process(2));
    }

    @Test
    void shouldReturnFizzWithNumberDivisibleByThree() {
        assertEquals("Fizz", fizzBuzz.process(3));
        assertEquals("Fizz", fizzBuzz.process(33));
    }

    @Test
    void shouldReturnBuzzWithNumberDivisibleByFive() {
        assertEquals("Buzz", fizzBuzz.process(5));
        assertEquals("Buzz", fizzBuzz.process(65));
    }

    @Test
    void shouldReturnFizzBuzzWithNumberDivisibleByBothFiveAndThree() {
        assertEquals("FizzBuzz", fizzBuzz.process(15));
        assertEquals("FizzBuzz", fizzBuzz.process(60));
    }
}