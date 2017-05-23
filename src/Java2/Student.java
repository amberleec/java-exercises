package Java2;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

/**
 * Created by Amberlee on 5/22/17.
 */
    public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student (String name){
        this.name = name;
        this.grades = new ArrayList<Double>();
    }

    public String getName(){
        return name;

    }

    public void printGrades(){
        for (double grade : grades){
            System.out.println(grade);
        }

    }

    public void addGrade(double grade){
        grades.add(grade);

    }

    public double getGradeAverage(){
        double gradeTotal = 0;
        for (double grade : grades) {
            gradeTotal+= grade;
        }
        return gradeTotal / grades.size();
    }

    public static void main(String[] args) {
        Student Jane = new Student("Jane");

        System.out.println(Jane.getName());
        Jane.addGrade(100);
        Jane.addGrade(90);
        Jane.addGrade(95);
        Jane.addGrade(93);
        Jane.addGrade(90);

        System.out.println(Jane.getGradeAverage());

        Student Joe = new Student("Joe");

        System.out.println(Joe.getName());
        Joe.addGrade(100);
        Joe.addGrade(50);

        System.out.println(Joe.getGradeAverage());

        Student Ethan = new Student("Ethan");

        System.out.println(Ethan.getName());
        Ethan.addGrade(100);
        Ethan.addGrade(78);
        Ethan.addGrade(69);

        System.out.println(Ethan.getGradeAverage());
    }


}
