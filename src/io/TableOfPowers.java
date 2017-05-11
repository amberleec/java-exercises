package io;

import java.util.Scanner;

/**
 * Created by Amberlee on 5/10/17.
 */
public class TableOfPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int limit = input.nextInt();

        System.out.println("Here is your table!");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= limit; i++) {
            System.out.printf("%d      | %d       | %d%n", i, i * i, i * i * i);
        }
        System.out.println("Do you want to continue?");
    }
}
