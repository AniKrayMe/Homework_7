package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.greet();
        Student student = new Student(21);
        student.greet();
        student.displayStudentAge();
        Teacher teacher = new Teacher(28);
        teacher.greet();
        teacher.explain();
    }
}
