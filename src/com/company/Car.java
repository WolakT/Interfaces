package com.company;

/**
 * Created by RENT on 2017-05-22.
 */
public class Car implements Comparable<Car> {
    private int carAge;


    public Car(int carAge) {
        this.carAge = carAge;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    @Override
    public int compareTo(Car o) {
        if (this.carAge > o.carAge)
            return 1;
        if (this.carAge < o.carAge)
            return -1;
        else
            return 0;
    }
}
