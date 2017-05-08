package io;
import java.util.Scanner;
/**
 * Created by Amberlee on 5/8/17.
 */
public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


//        Scanner scan = new Scanner(System.in);
//
//        String answer;
//
//        System.out.println("What is your age?");
//        int age = scan.nextInt();
//        System.out.println("Your age is: " + age);
//
//        System.out.println("In three words, tell me about your day:");
//
//        answer = scan.nextLine();
//
//        System.out.println("How was your day: " + answer);


        float length;
        float width;
        float height;
        String input1;
        String input2;


        System.out.println("Enter room dimensions");
        System.out.println("Enter room length first. Decimals are ok.");


        length = in.nextFloat();
        System.out.println("Enter width: ");
        width = in.nextFloat();
        System.out.println("Enter height: ");
        height = in.nextFloat();

        System.out.println("The calculated dimensions are below");
        System.out.println("Area = " + (length * width) + " sq/ft");
        System.out.println("Perimeter = " + (length*2) + " ft " + (width*2) + " ft");
        System.out.println("Volume = " + (length*width*height) + " cu/ft");


        }
    }

