package OOP_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intro {

    public void giveIntro(List<Student> students) {
        for (Student student : students) {
            System.out.println("Hello my name is " + student.name + " and my roll no is " + student.rollNo);
        }
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("How many students: ");
        int n = ob.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            String name = ob.next();

            System.out.print("Enter Roll No: ");
            int rollNo = ob.nextInt();

            students.add(new Student(name, rollNo));
        }

        new Intro().giveIntro(students);
    }
}
