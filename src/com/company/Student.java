package com.company;

public class Student extends Person {
    public Student(int age) {
        super(age);
    }
    public void goToLesson(){
        System.out.println("I’m going to Lesson");
    }
    public void displayStudentAge(){
        System.out.println("I am "+this.getAge()+" years old");
    }
}
