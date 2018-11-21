package com.movingAverage;

public class MovingAverage implements IMovingAverage {
    double lastN[];
    double average;
    int maxTotal;
    int total;
    int head;

    public MovingAverage(int N){
        this.maxTotal = N;
        this.lastN = new double[N];
        this.average = 0;
        this.head = 0;
        this.total = 0;
    }

    /* keep appending to the array until array is full.
    Use modulus of maxTotal (ie. N) for circular position of the array.
    The position of the head when next element is added, the free slot for
    new element would be the previous slot of head.
    Remove first element when buffer is full when new element is added.
    O(1) time implementation.
    */
    public void add(double newNum){
        double prevSum = this.total * this.average;

        if(this.total == this.maxTotal){
            prevSum -= this.lastN[this.head];
            this.total--;
        }

        this.head = (this.head+1)%this.maxTotal;

        int emptyPosition = (this.maxTotal + this.head - 1)%this.maxTotal;
        this.lastN[emptyPosition] = newNum;

        double newSum = prevSum + newNum;
        this.total++;
        this.average = newSum/this.total;
    }

    public double getAverage(){
        return this.average;
    }

    public double[] getElements(){
        return this.lastN;
    }
}
