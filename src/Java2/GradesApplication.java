package Java2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Amberlee on 5/23/17.
 */
public class GradesApplication {
    public static Scanner scanner = new Scanner(System.in);

    public static  void getStudentInfo(Map <String, Student> list){


        System.out.println("Here are the Github usernames of our students");
        printOutUsernames(list);

    }
    public static void printOutUsernames(Map <String, Student> list){
        list.forEach((k, v) -> {
            System.out.println(k);

        });

        System.out.println("Either choose a student or choose all");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("all")){

            list.forEach((key, value) ->{
                System.out.println("Student: " + value.getName());
                value.printGrades();
            });
        }

        else if (list.get(input) == null){
            System.out.println("Sorry, no student found with the gihub username of \""+ input + "\".");

        }

        else {
            System.out.println("Name :" + list.get(input).getName() + "  - Github Username:  " + input);
            System.out.println("Current Average:  " + list.get(input).getGradeAverage());
            System.out.println("GRADES");
            list.get(input).printGrades();

        }

        seeAnotherStudent(list);
    }


    public static void seeAnotherStudent(Map <String, Student> list){
        System.out.println("Would you like to see another student?");

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            printOutUsernames(list);
        }
        else {
            System.out.println("Goodbye, and have a wonderful day!");
            System.exit(0);
        }
        scanner.next();

    }
