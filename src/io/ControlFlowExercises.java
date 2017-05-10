package io;

/**
 * Created by Amberlee on 5/9/17.
 */
public class ControlFlowExercises {

    public static void main(String[] args) {
        int first = 5;

        while(first<=15) {
            System.out.println("First number" + first);
            first++;
        }

        int second = 0;

        do {
            System.out.println("Second number" + second);
            second+=2;
        } while (second<=100);

        int negative = -10;

        do {
            System.out.println("Negative number" + negative);
            negative+=5;
        } while (negative <= 100);

        int begining = 2;

        do {
            System.out.println("Begining number" + begining);
            begining+=2;
        } while(begining<=1000000);


    }}
