package com.company;

import java.util.Collection;

/**
 * Created by RENT on 2017-05-22.
 */
public class BubbleSort implements Sorter {


    @Override
    public Person[] sort(Person[] array) {

            boolean swapped = false;
            int counter = 0;
            for (int i = 0; i <array.length ; i++) {
                swapped =false;
                System.out.println("to jest wejscie do petli nr " + i);
                for (int j = 0; j <array.length-1 ; j++) {
                    //System.out.println("to jest wejscie do podpetli nr " + j);
                    if(array[j].compareTo(array[j+1])>0){
                        swap(array,j,j+1);
                        swapped = true;

                    }else{

                        counter ++;
                    }
                }
                if (!swapped)
                    break;
                counter = 0;
            }
            return array;
        }
        static Person[] swap (Person[] array, int p, int r){
            Person temp = array[p];
            array[p] = array[r];
            array[r] = temp;
            return array;
        }
    }

