package com.company;

public  class Person {
    private int age;

    //region Constructor
    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }
    //endregion

    //region Getter and Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion

    public void greet() {
        System.out.println("Hello");
    }

}
