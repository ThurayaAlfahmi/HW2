package org.example.testing;

import java.util.HashMap;
import java.util.Map;

public class Course {
    private String courseId;
    private String name;
    private double price;
    private double money_earned;
    private Teacher teacher;



    public Course(String name, double price) {
        this.name = name;
        this.price = price;
//        generateId();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoney_earned() {
        return money_earned;
    }

    public void setMoney_earned(double money_earned) {
        this.money_earned = money_earned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void SHOWCOURSES(){

    }
}


