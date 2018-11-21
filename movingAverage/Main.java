package com.movingAverage;

public class Main {

    public static void main(String[] args) {
        MovingAverage ma = new MovingAverage(3);

        ma.add(1);
        ma.add(2);
        ma.add(5);
        ma.add(4);
        System.out.println("Average: " + ma.getAverage());
        double[] elements = ma.getElements();

        for(int i=0; i< elements.length; i++){
            System.out.println(elements[i]);
        }

        System.out.println("");
        ma.add(6);

        System.out.println("Average: " + ma.getAverage());
        elements = ma.getElements();

        for(int i=0; i< elements.length; i++){
            System.out.println(elements[i]);
        }
    }
}
