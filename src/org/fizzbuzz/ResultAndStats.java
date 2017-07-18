package org.fizzbuzz;

import java.util.HashMap;

class ResultAndStats {
    private String output = "";
    private HashMap<String, Integer> stats = new HashMap<>();

    void setOutput(String output) {
        this.output = output;
    }

    String getOutput() {
        return output;
    }

    void incFizz() {
        incStat(FizzBuzz.FIZZ);
    }

    int getFizzCount() {
        return getStat(FizzBuzz.FIZZ);
    }

    void incBuzz() {
        incStat(FizzBuzz.BUZZ);
    }

    int getBuzzCount() {
        return getStat(FizzBuzz.BUZZ);
    }

    void incFizzBuzz() {
        incStat(FizzBuzz.FIZZ + FizzBuzz.BUZZ);
    }

    int getFizzBuzzCount() {
        return getStat(FizzBuzz.FIZZ + FizzBuzz.BUZZ);
    }

    void incLuck() {
        incStat(FizzBuzz.LUCK);
    }

    int getLuckCount() {
        return getStat(FizzBuzz.LUCK);
    }

    void incNumber() {
        incStat(FizzBuzz.NUMBER);
    }

    int getNumberCount() {
        return getStat(FizzBuzz.NUMBER);
    }

    private void incStat(String key) {
        Integer currentValue = stats.get(key);
        stats.put(key, null == currentValue ? 1 : currentValue + 1);
    }

    private int getStat(String key) {
        return null == stats.get(key) ? 0 : stats.get(key);
    }
}
