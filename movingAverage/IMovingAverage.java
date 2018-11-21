package com.movingAverage;

/* using circular buffer data structure */
public interface IMovingAverage {

    /* add new element to list and recompute average*/
    void add(double newNum);

    /* get moving average value */
    double getAverage();

    /* get elements in the array */
    double[] getElements();
}
