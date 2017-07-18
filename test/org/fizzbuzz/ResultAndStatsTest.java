package org.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResultAndStatsTest {
    @Test
    public void correctInitialValues() {
        ResultAndStats resultAndStats = new ResultAndStats();

        assertEquals(0, resultAndStats.getFizzCount());
        assertEquals(0, resultAndStats.getBuzzCount());
        assertEquals(0, resultAndStats.getFizzBuzzCount());
        assertEquals(0, resultAndStats.getLuckCount());
        assertEquals(0, resultAndStats.getNumberCount());
    }

    @Test
    public void updateOutput() {
        ResultAndStats resultAndStats = new ResultAndStats();
        String expected = "abc";

        resultAndStats.setOutput(expected);

        assertEquals(expected, resultAndStats.getOutput());
    }

    @Test
    public void updatedFizzStatCount() {
        ResultAndStats resultAndStats = new ResultAndStats();

        resultAndStats.incFizz();

        assertEquals(1, resultAndStats.getFizzCount());
    }

    @Test
    public void updatedBuzzStatCount() {
        ResultAndStats resultAndStats = new ResultAndStats();

        resultAndStats.incBuzz();

        assertEquals(1, resultAndStats.getBuzzCount());
    }

    @Test
    public void updatedFizzBuzzStatCount() {
        ResultAndStats resultAndStats = new ResultAndStats();

        resultAndStats.incFizzBuzz();

        assertEquals(1, resultAndStats.getFizzBuzzCount());
    }

    @Test
    public void updatedLuckStatCount() {
        ResultAndStats resultAndStats = new ResultAndStats();

        resultAndStats.incLuck();

        assertEquals(1, resultAndStats.getLuckCount());
    }

    @Test
    public void updatedNumberStatCount() {
        ResultAndStats resultAndStats = new ResultAndStats();

        resultAndStats.incNumber();

        assertEquals(1, resultAndStats.getNumberCount());
    }
}
