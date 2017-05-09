package io;
import java.util.Scanner;
/**
 * Created by Amberlee on 5/8/17.
 */
public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Enter an integer value");
        int aNumber = input.nextInt();

        System.out.println("The integer value:  " + aNumber);


        System.out.println("Enter a word");
        String word = input.next();
        System.out.println(word);

        System.out.println("Enter another word");
        String secondWord = input.next();
        System.out.println(secondWord);

        System.out.println("Enter one last word");
        String lastWord = input.next();
        System.out.println(lastWord);

        float length;
        float width;
        float height;
        String input1;
        String input2;


        System.out.println("Enter room dimensions");
        System.out.println("Enter room length first. Decimals are ok.");


        length = input.nextFloat();
        System.out.println("Enter width: ");
        width = input.nextFloat();
        System.out.println("Enter height: ");
        height = input.nextFloat();

        System.out.println("The calculated dimensions are below");
        System.out.println("Area = " + (length * width) + " sq/ft");
        System.out.println("Perimeter = " + (length*2) + " ft " + (width*2) + " ft");
        System.out.println("Volume = " + (length*width*height) + " cu/ft");






        }
    }

