import java.util.Scanner;

/**
 * Created by Amberlee on 5/8/17.
 */
public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String answer;

        System.out.println("What is your age?");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("In three words, tell me about your day:");

        answer = scan.nextLine();

        System.out.println("How was your day: " + answer);

        answer = scan.nextLine();

        System.out.println("What is the length and width of the classroom?");
        int length;
        int width;
        int perimeter = 2 * length + 2 * width;

        System.out.println("Length and width: " + perimeter);




    }
    }

