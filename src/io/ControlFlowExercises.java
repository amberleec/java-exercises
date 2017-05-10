package io;

/**
 * Created by Amberlee on 5/9/17.
 */
public class ControlFlowExercises {

    public static void main(String[] args) {
        int first = 5;

        while (first <= 15) {
            System.out.println("First number" + first);
            first++;
        }

        int second = 0;

        do {
            second += 2;
            System.out.println("Second number" + second);

        } while (second <= 100);

        int negative = -10;

        do {
            negative += 5;
            System.out.println("Negative number" + negative);

        } while (negative <= 100);


        long begining = 2;

        do {
            begining = begining * begining;
            System.out.println("Begining number" + begining);

        } while (begining <= 1000000);

        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.print("fizzbuzz");
            else if ((i % 3) == 0)
                System.out.print("fizz");
            else if ((i % 5) == 0)
                System.out.print("buzz");
            else System.out.print(i);
            System.out.print(" ");
        }
    }
}
