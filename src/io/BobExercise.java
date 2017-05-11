package io;

import java.util.Scanner;

/**
 * Created by Amberlee on 5/11/17.
 */
public class BobExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Talk with Bob:");
        String message = input.nextLine();

        if(message.endsWith("?")) {
            System.out.println("Sure.");
        } else if (message.isEmpty()) {
            System.out.println("Fine. be that way!");
        } else if (message.endsWith("!") || message.toUpperCase().equals(message)) {
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
