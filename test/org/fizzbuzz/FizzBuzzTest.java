package org.fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    @Test(expected = IllegalArgumentException.class)
    public void startMustBeAfterEnd() {
        FizzBuzz.output(20,1);
    }


    @Test
    public void correctNumber() {
        String expected = "1";

        assertEquals(FizzBuzz.output(1, 1), expected);
    }

    @Test
    public void correctFizz() {
        String expected = "fizz";

        assertEquals(FizzBuzz.output(3, 3), expected);
        assertEquals(FizzBuzz.output(6, 6), expected);
    }

    @Test
    public void correctBuzz() {
        String expected = "buzz";

        assertEquals(FizzBuzz.output(5, 5), expected);
        assertEquals(FizzBuzz.output(20, 20), expected);
    }

    @Test
    public void correctFizzBuzz() {
        String expected = "fizzbuzz";

        assertEquals(FizzBuzz.output(15, 15), expected);
        assertEquals(FizzBuzz.output(30, 30), expected);
    }

    @Test
    public void correctFizzBuzzLuckInFirst20() {
        String expected = "1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz";

        assertEquals(FizzBuzz.output(1, 20), expected);
    }

    @Test
    public void correctLuck() {
        String expected = "luck";

        assertEquals(FizzBuzz.output(3,3), expected);
        assertEquals(FizzBuzz.output(13,13), expected);
    }
}
