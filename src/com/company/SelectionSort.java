package com.company;

import java.util.Collection;

/**
 * Created by RENT on 2017-05-22.
 */
public class SelectionSort implements Sorter {

    public Person[] sort(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            for (int j = i; j < persons.length - 1; j++) {
                if (persons[i].compareTo(persons[j + 1]) > 0) {
                    swap(persons, i, j + 1);
                }
            }
        }

        return persons;
    }

    //checks alphabetical order of two Strings and returns true if first is higher
    public static boolean isHigherInAlphabet(String first, String second) {
        if (first.compareTo(second) < 0) {
            return true;
        } else return false;

    }

    public static Person[] swap(Person[] persons, int p, int r) {
        Person temp = persons[p];
        persons[p] = persons[r];
        persons[r] = temp;

        return persons;
    }
    public Person[] sortAll(Comparable[] coll) {

        for (int i = 0; i < coll.length; i++) {
            if(coll[i].compareTo(coll[i+1])>0){
                swap(coll,i,i+1);
            }
        }


        return persons;
    }

}
