package org.fizzbuzz;

public class FizzBuzz {
    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";

    public static String output(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start must be before the End value provided");
        }

        StringBuilder builder = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (isFizzBuzz(i)) {
                builder.append(FIZZ).append(BUZZ);
            } else if (isFizz(i)) {
                builder.append(FIZZ);
            } else if (isBuzz(i)) {
                builder.append(BUZZ);
            } else {
                builder.append(i);
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
}
