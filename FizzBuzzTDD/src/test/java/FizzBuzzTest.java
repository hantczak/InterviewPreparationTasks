
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void initialize() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldProcessSingleNumber() {
        assertAll(
                () -> assertEquals("1", fizzBuzz.process(1)),
                () -> assertEquals("2", fizzBuzz.process(2))
        );
    }

    @Test
    void shouldReturnFizzWithNumberDivisibleByThree() {
        assertAll(
                () -> assertEquals("Fizz", fizzBuzz.process(3)),
                () -> assertEquals("Fizz", fizzBuzz.process(33))
        );
    }

    @Test
    void shouldReturnBuzzWithNumberDivisibleByFive() {
        assertAll(
                () -> assertEquals("Buzz", fizzBuzz.process(5)),
                () -> assertEquals("Buzz", fizzBuzz.process(65))
        );
    }

    @Test
    void shouldReturnFizzBuzzWithNumberDivisibleByBothFiveAndThree() {
        assertAll();
        assertAll(
                () -> assertEquals("FizzBuzz", fizzBuzz.process(15)),
                () -> assertEquals("FizzBuzz", fizzBuzz.process(60))
        );
    }

    @ParameterizedTest
    @CsvSource({"1,1","3,Fizz","5,Buzz","15,FizzBuzz"})
    void testOutput(long input, String outcome){
        assertEquals(fizzBuzz.process(input),outcome);
    }


}