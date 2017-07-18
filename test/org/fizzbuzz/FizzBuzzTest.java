package org.fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    @Test(expected = IllegalArgumentException.class)
    public void startMustBeAfterEnd() {
        FizzBuzz.output(20,1, new ResultAndStats());
    }

    @Test
    public void correctNumber() {
        String expected = "1";

        ResultAndStats resultAndStats = FizzBuzz.outputWithStats(1, 1);
        assertEquals(expected, resultAndStats.getOutput());
        assertEquals(0, resultAndStats.getFizzCount());
        assertEquals(0, resultAndStats.getBuzzCount());
        assertEquals(0, resultAndStats.getFizzBuzzCount());
        assertEquals(0, resultAndStats.getLuckCount());
        assertEquals(1, resultAndStats.getNumberCount());
    }

    @Test
    public void moreThanOneCorrectNumber() {
        String expected = "1 2";

        ResultAndStats resultAndStats = FizzBuzz.outputWithStats(1, 2);
        assertEquals(expected, resultAndStats.getOutput());
        assertEquals(0, resultAndStats.getFizzCount());
        assertEquals(0, resultAndStats.getBuzzCount());
        assertEquals(0, resultAndStats.getFizzBuzzCount());
        assertEquals(0, resultAndStats.getLuckCount());
        assertEquals(2, resultAndStats.getNumberCount());
    }

    @Test
    public void correctFizz() {
        String expected = "fizz";

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(6, 6);
            assertEquals(expected, resultAndStats.getOutput());
            assertEquals(1, resultAndStats.getFizzCount());
            assertEquals(0, resultAndStats.getBuzzCount());
            assertEquals(0, resultAndStats.getFizzBuzzCount());
            assertEquals(0, resultAndStats.getLuckCount());
            assertEquals(0, resultAndStats.getNumberCount());
        }

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(9, 9);
            assertEquals(expected, resultAndStats.getOutput());
            assertEquals(1, resultAndStats.getFizzCount());
            assertEquals(0, resultAndStats.getBuzzCount());
            assertEquals(0, resultAndStats.getFizzBuzzCount());
            assertEquals(0, resultAndStats.getLuckCount());
            assertEquals(0, resultAndStats.getNumberCount());
        }
    }

    @Test
    public void correctBuzz() {
        String expected = "buzz";

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(5, 5);
            assertEquals(expected, resultAndStats.getOutput());
            assertEquals(0, resultAndStats.getFizzCount());
            assertEquals(1, resultAndStats.getBuzzCount());
            assertEquals(0, resultAndStats.getFizzBuzzCount());
            assertEquals(0, resultAndStats.getLuckCount());
            assertEquals(0, resultAndStats.getNumberCount());
        }

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(20, 20);
            assertEquals(expected, resultAndStats.getOutput());
            assertEquals(0, resultAndStats.getFizzCount());
            assertEquals(1, resultAndStats.getBuzzCount());
            assertEquals(0, resultAndStats.getFizzBuzzCount());
            assertEquals(0, resultAndStats.getLuckCount());
            assertEquals(0, resultAndStats.getNumberCount());
        }
    }

    @Test
    public void correctFizzBuzz() {
        String expected = "fizzbuzz";

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(15, 15);
            assertEquals(expected, resultAndStats.getOutput());
            assertEquals(0, resultAndStats.getFizzCount());
            assertEquals(0, resultAndStats.getBuzzCount());
            assertEquals(1, resultAndStats.getFizzBuzzCount());
            assertEquals(0, resultAndStats.getLuckCount());
            assertEquals(0, resultAndStats.getNumberCount());
        }

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(45, 45);
            assertEquals(expected, resultAndStats.getOutput());
            assertEquals(0, resultAndStats.getFizzCount());
            assertEquals(0, resultAndStats.getBuzzCount());
            assertEquals(resultAndStats.getFizzBuzzCount(), 1);
            assertEquals(0, resultAndStats.getLuckCount());
            assertEquals(0, resultAndStats.getNumberCount());
        }
    }

    @Test
    public void correctFizzBuzzLuckInFirst20() {
        String expected = "1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz";

        ResultAndStats resultAndStats = FizzBuzz.outputWithStats(1, 20);
        assertEquals(expected, resultAndStats.getOutput());
        assertEquals(4, resultAndStats.getFizzCount());
        assertEquals(3, resultAndStats.getBuzzCount());
        assertEquals(1, resultAndStats.getFizzBuzzCount());
        assertEquals(2, resultAndStats.getLuckCount());
        assertEquals(10, resultAndStats.getNumberCount());
    }

    @Test
    public void correctLuck() {
        String expected = "luck";

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(3, 3);
            assertEquals(expected, resultAndStats.getOutput());
            assertEquals(0, resultAndStats.getFizzCount());
            assertEquals(0, resultAndStats.getBuzzCount());
            assertEquals(0, resultAndStats.getFizzBuzzCount());
            assertEquals(1, resultAndStats.getLuckCount());
            assertEquals(0, resultAndStats.getNumberCount());
        }

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(13, 13);
            assertEquals(expected, resultAndStats.getOutput());
            assertEquals(resultAndStats.getFizzCount(), 0);
            assertEquals(0, resultAndStats.getBuzzCount());
            assertEquals(0, resultAndStats.getFizzBuzzCount());
            assertEquals(1, resultAndStats.getLuckCount());
            assertEquals(0, resultAndStats.getNumberCount());
        }
    }
}
