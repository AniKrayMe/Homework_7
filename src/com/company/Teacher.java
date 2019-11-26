package com.company;

public class Teacher extends Person{
    private String subject;
    //why I create subject?

    //region Getter and Setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
//endregion


    public Teacher(int age) {
        super(age);
    }

    public void explain(){
        System.out.println("Explanation begins");
    }
}
