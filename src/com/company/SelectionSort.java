package com.company;

/**
 * Created by RENT on 2017-05-22.
 */
public class SelectionSort implements Sorter {

    public Person[] sort(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            for (int j = i; j < persons.length - 1; j++) {
                if (persons[i].getAge() > persons[j + 1].getAge()) {
                    swap(persons, i, j + 1);
                }
                else if (persons[i].getAge() == persons[j + 1].getAge()) {
                    if(!isHigherInAlphabet(persons[i].getName(),persons[j+1].getName())){
                        swap(persons, i, j+1);
                    }
                }
            }
        }

        return persons;
    }
    //checks alphabetical order of two Strings and returns true if first is higher
    public static boolean isHigherInAlphabet(String first, String second) {
        if(first.compareTo(second)<0){
            return true;
        }else return false;

    }

    public static Person[] swap(Person[] persons, int p, int r) {
        Person temp = persons[p];
        persons[p] = persons[r];
        persons[r] = temp;

        return persons;
    }
}
