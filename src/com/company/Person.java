package com.company;

/**
 * Created by RENT on 2017-05-19.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if (this.getAge() > p.getAge()) {
            return 1;
        } else if (this.getAge() == p.getAge()) {
            return this.getName().compareTo(p.getName());
        } else {
            return 0;
        }
    }

}
