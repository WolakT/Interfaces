package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person("Józek", 21);
        Person p2 = new Person("Franek", 34);
        Person p3 = new Person("Jacek", 29);
        Person p4 = new Person ("Jacek", 10);
        Person p5 = new Person ("Zenon", 34);
        Person p6 = new Person("Adaś", 34);
        Person[] people = {p1,p2,p3,p4,p5,p6};

        new BubbleSort().sort(people);
        for (Person p :people  ) {
            System.out.println(p.getAge() + " " + p.getName());
        }
        System.out.println("Selection sort");
        System.out.println();

        new SelectionSort().sort(people);

        for (Person p :people  ) {
            System.out.println(p.getAge() + " " + p.getName());
        }



    }
}
