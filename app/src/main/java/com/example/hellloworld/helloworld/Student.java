package com.example.hellloworld.helloworld;

/**
 * Created by Administrator on 2016/10/25.
 */

public class Student {
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}