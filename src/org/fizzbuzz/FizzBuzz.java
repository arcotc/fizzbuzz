package org.fizzbuzz;

public class FizzBuzz {
    protected static final String FIZZ = "fizz";
    protected static final String BUZZ = "buzz";
    protected static final String LUCK = "luck";
    protected static final String NUMBER = "number";

    public static void main(String[] args) {
        ResultAndStats resultAndStats = outputWithStats(1, 20);

        System.out.println(resultAndStats.getOutput());
        System.out.println();
        System.out.println(FIZZ + ": " + resultAndStats.getFizzCount());
        System.out.println(BUZZ + ": " + resultAndStats.getBuzzCount());
        System.out.println(FIZZ + BUZZ + ": " + resultAndStats.getFizzBuzzCount());
        System.out.println(LUCK + ": " + resultAndStats.getLuckCount());
        System.out.println(NUMBER + ": " + resultAndStats.getNumberCount());
    }

    public static ResultAndStats outputWithStats(int start, int end) {
        ResultAndStats resultAndStats = new ResultAndStats();

        resultAndStats.setOutput(output(start, end, resultAndStats));

        return resultAndStats;
    }

    public static String output(final int start, final int end, ResultAndStats resultAndStats) {
        if (start > end) {
            throw new IllegalArgumentException("Start must be before the End value provided");
        }

        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (isLuck(i)) {
                builder.append(LUCK);
                resultAndStats.incLuck();
            } else if (isFizzBuzz(i)) {
                builder.append(FIZZ).append(BUZZ);
                resultAndStats.incFizzBuzz();
            } else if (isFizz(i)) {
                builder.append(FIZZ);
                resultAndStats.incFizz();
            } else if (isBuzz(i)) {
                builder.append(BUZZ);
                resultAndStats.incBuzz();
            } else {
                builder.append(i);
                resultAndStats.incNumber();
            }

            builder.append(" ");
        }

        return builder.toString().trim();
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private static boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    private static boolean isLuck(int number) {
        return Integer.toString(number).contains("3");
    }
}
