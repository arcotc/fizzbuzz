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

        ResultAndStats resultAndStats = FizzBuzz.outputWithStats(1, 1);
        assertEquals(resultAndStats.output, expected);
        assertEquals(resultAndStats.stats.getFizzCount(), 0);
        assertEquals(resultAndStats.stats.getBuzzCount(), 0);
        assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 0);
        assertEquals(resultAndStats.stats.getLuckCount(), 0);
        assertEquals(resultAndStats.stats.getNumberCount(), 1);
    }

    @Test
    public void moreThanOneCorrectNumber() {
        String expected = "1 2";

        ResultAndStats resultAndStats = FizzBuzz.outputWithStats(1, 2);
        assertEquals(resultAndStats.output, expected);
        assertEquals(resultAndStats.stats.getFizzCount(), 0);
        assertEquals(resultAndStats.stats.getBuzzCount(), 0);
        assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 0);
        assertEquals(resultAndStats.stats.getLuckCount(), 0);
        assertEquals(resultAndStats.stats.getNumberCount(), 2);
    }

    @Test
    public void correctFizz() {
        String expected = "fizz";

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(6, 6);
            assertEquals(FizzBuzz.output(6, 6), expected);
            assertEquals(resultAndStats.output, expected);
            assertEquals(resultAndStats.stats.getFizzCount(), 1);
            assertEquals(resultAndStats.stats.getBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getLuckCount(), 0);
            assertEquals(resultAndStats.stats.getNumberCount(), 0);
        }

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(9, 9);
            assertEquals(resultAndStats.output, expected);
            assertEquals(resultAndStats.stats.getFizzCount(), 1);
            assertEquals(resultAndStats.stats.getBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getLuckCount(), 0);
            assertEquals(resultAndStats.stats.getNumberCount(), 0);
        }
    }

    @Test
    public void correctBuzz() {
        String expected = "buzz";

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(5, 5);
            assertEquals(resultAndStats.output, expected);
            assertEquals(resultAndStats.stats.getFizzCount(), 0);
            assertEquals(resultAndStats.stats.getBuzzCount(), 1);
            assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getLuckCount(), 0);
            assertEquals(resultAndStats.stats.getNumberCount(), 0);
        }

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(20, 20);
            assertEquals(resultAndStats.output, expected);
            assertEquals(resultAndStats.stats.getFizzCount(), 0);
            assertEquals(resultAndStats.stats.getBuzzCount(), 1);
            assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getLuckCount(), 0);
            assertEquals(resultAndStats.stats.getNumberCount(), 0);
        }
    }

    @Test
    public void correctFizzBuzz() {
        String expected = "fizzbuzz";

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(15, 15);
            assertEquals(resultAndStats.output, expected);
            assertEquals(resultAndStats.stats.getFizzCount(), 0);
            assertEquals(resultAndStats.stats.getBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 1);
            assertEquals(resultAndStats.stats.getLuckCount(), 0);
            assertEquals(resultAndStats.stats.getNumberCount(), 0);
        }

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(45, 45);
            assertEquals(resultAndStats.output, expected);
            assertEquals(resultAndStats.stats.getFizzCount(), 0);
            assertEquals(resultAndStats.stats.getBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 1);
            assertEquals(resultAndStats.stats.getLuckCount(), 0);
            assertEquals(resultAndStats.stats.getNumberCount(), 0);
        }
    }

    @Test
    public void correctFizzBuzzLuckInFirst20() {
        String expected = "1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz";

        ResultAndStats resultAndStats = FizzBuzz.outputWithStats(1, 20);
        assertEquals(resultAndStats.output, expected);
        assertEquals(resultAndStats.stats.getFizzCount(), 4);
        assertEquals(resultAndStats.stats.getBuzzCount(), 3);
        assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 1);
        assertEquals(resultAndStats.stats.getLuckCount(), 2);
        assertEquals(resultAndStats.stats.getNumberCount(), 10);
    }

    @Test
    public void correctLuck() {
        String expected = "luck";

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(3, 3);
            assertEquals(resultAndStats.output, expected);
            assertEquals(resultAndStats.stats.getFizzCount(), 0);
            assertEquals(resultAndStats.stats.getBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getLuckCount(), 1);
            assertEquals(resultAndStats.stats.getNumberCount(), 0);
        }

        {
            ResultAndStats resultAndStats = FizzBuzz.outputWithStats(13, 13);
            assertEquals(resultAndStats.output, expected);
            assertEquals(resultAndStats.stats.getFizzCount(), 0);
            assertEquals(resultAndStats.stats.getBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getFizzbBuzzCount(), 0);
            assertEquals(resultAndStats.stats.getLuckCount(), 1);
            assertEquals(resultAndStats.stats.getNumberCount(), 0);
        }
    }
}
