package org.example.testing;

import java.util.Scanner;
import java.util.UUID;

public class Teacher {
    private String teacherId;
    private String name;
    private double salary;

    public Teacher() {

        this.teacherId = generateTeacherId();
    }

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.teacherId = generateTeacherId();
    }
    // Method to generate a unique teacherId
    private String generateTeacherId() {
        // Using UUID to generate a unique identifier
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public String getTeacherId() {

        return teacherId;
    }

    public void setTeacherId(String teacherId) {

        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void SHOWTEACHERS() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public void LOOKUPTEACHER (){
        System.out.println(" The Teacher Id:" + this.teacherId +" Name: "+ this.name + " Salary: " + this.salary);

    }

}
