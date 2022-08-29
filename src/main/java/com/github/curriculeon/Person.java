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

    public Person(int age) {
    }

    public Person(String name) {

    }

    public Person(String name, int age) {
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
