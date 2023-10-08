package org.example.testing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //asking for a name for the school
        System.out.println("Enter the name for the school: ");
        String school = scanner.next();

        System.out.println("Enter the number of Teachers: ");
        int numOfTeachers = scanner.nextInt();
        scanner.nextLine();

        Teacher[] teachers = new Teacher[numOfTeachers];

        for (int i = 0; i < numOfTeachers; i++) {
            System.out.print("Enter the name of Teacher " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the salary of Teacher " + (i + 1) + ": ");
            int salary = scanner.nextInt();
            scanner.nextLine();

            teachers[i] = new Teacher(name, salary);
        }

        // Display the details of each teacher
        for (int i = 0; i < numOfTeachers; i++) {
            System.out.println("Details for Teacher " + (i + 1) + ":");
            teachers[i].SHOWTEACHERS();

        }
      //Display the details of specified teacher
        System.out.println("Enter the id of the Teacher to display the full details: " );
        String num= scanner.next();

        for(int k = 0; k < teachers.length; k++) {
            if (num.equals( teachers[k].getTeacherId()))
            {
                teachers[k].LOOKUPTEACHER();
            }}







//        System.out.println("Enter the number of Teachers: ");
//        int numOfTeacher = scanner.nextInt();
//       // Create an array to store the details of each teacher
//        String[] teacherDetails = new String[numOfTeacher];
//        // Loop to input details for each teacher
//        for (int i = 0; i < numOfTeacher; i++) {
//            System.out.print("Enter details for Teacher " + (i + 1) + ": ");
//            teacherDetails[i] = scanner.next();
//        }
//         // Display the details of each Teacher
//        System.out.println("List of Teacher with details:");
//        for (int i = 0; i < numOfTeacher; i++) {
//            System.out.println("Teacher " + (i + 1) + ": " + teacherDetails[i]);
//        }



        System.out.print("Enter the number of course: ");
        int numberOfCourse = scanner.nextInt();

        // Create an array to store the details of each Course
        String[] courseDetails = new String[numberOfCourse];

        // Loop to input details for each Course
        for (int i = 0; i < numberOfCourse; i++) {
            System.out.print("Enter details for Course " + (i + 1) + ": ");
            courseDetails[i] = scanner.next();
        }

        // Display the details of each Course
        System.out.println("List of Course with details:");
        for (int i = 0; i < numberOfCourse; i++) {
            System.out.println("Course " + (i + 1) + ": " + courseDetails[i]);
        }

        Map<String, String> entryIdToAnotherIdMap = new HashMap<>();


        System.out.print("Enter the number of Students: ");
        int numberOfStudents = scanner.nextInt();

        // Create an array to store the details of each Student
        String[] StudentDetails = new String[numberOfStudents];

        // Loop to input details for each Student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter details for Student " + (i + 1) + ": ");
            StudentDetails[i] = scanner.next();
        }

        // Display the details of each Student
        System.out.println("List of Student with details:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + StudentDetails[i]);
        }


        // Close the scanner
        scanner.close();
    }
}