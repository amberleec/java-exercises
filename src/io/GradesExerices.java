package io;

/**
 * Created by Amberlee on 5/12/17.
 */
public class GradesExerices {
    public static void main(String[] args) {

         String scores;
        char grade;

        if(scores >= 90) {
            grade = "A";
        } else if (scores >= 80) {
            grade = "B";
        } else if (scores >= 70) {
            grade = "C";
        } else if (scores >= 60) {
            grade = "D";
        } else {
            grade = "F"''
        }
        System.out.println("Grade =" + grade);
    }
}
