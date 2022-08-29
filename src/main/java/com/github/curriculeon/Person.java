package com.github.curriculeon;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    Integer age;
    String name;

    public Person() {
        this. name = "";
        this.age = 2147483647;
    }

    public Person(Integer age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
