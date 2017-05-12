package io;

/**
 * Created by Amberlee on 5/12/17.
 */
public class Methods  {
    public static void main(String[] args) {

        addition(2);
        subtraction(7);
        multiplication(5);
        division(8);
        modulus(2);
        multipy(5,5);
    }

    public static void addition (int number) {
        int num = number;
        System.out.println(num+num);
    }

    public static void subtraction (int number) {
        int num = number;
        System.out.println(num-6);
    }

    public static void multiplication (int number) {
        int num = number;
        System.out.println(num*num);
    }

    public static void division (int number) {
        int num = number;
        System.out.println(num/2);
    }

    public static void modulus (int number) {
        int num = number;
        System.out.println(10%num);
        System.out.println(17%num);
    }

    public static void multipy (int number, int x) {
        int num = number;
        int s = x;
        for(int i = 0; i < s; i++){
            num+=s;
        }
        System.out.println(num++);
    }

}

