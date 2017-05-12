package io;

/**
 * Created by Amberlee on 5/12/17.
 */
public class Methods {
    public static void main(String[] args) {

        addition(2);
        subtraction(7);
        multiplication(5);
        division(8);
        modulus(2);
        multipy(5, 5);
    }

    public static void addition(int number) {
        System.out.println("Put in a number and add it!");
        int num = number;
        System.out.println(num + num);
    }

    public static void subtraction(int number) {
        System.out.println("Put in a number and subtraction!");
        int num = number;
        System.out.println(num - 6);
    }

    public static void multiplication(int number) {
        System.out.println("Put in a number and multiply!");
        int num = number;
        System.out.println(num * num);
    }

    public static void division(int number) {
        System.out.println("Put in a number and divide it!");
        int num = number;
        System.out.println(num / 2);
    }

    public static void modulus(int number) {
        System.out.println("Try out Modulus function!");
        int num = number;
        System.out.println(20 % num);
        System.out.println(6 % num);
    }

    public static void multipy(int number, int x) {
        int num = number;
        int s = x;
        for (int i = 0; i < s; i++) {
            num += s;
        }
        System.out.println(num++);
    }

    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("Try again if it does'nt work out!" + userInput);
        return userInput;
    }





}

