package com.zhou.demo.simpleretrofit.entity;

public class RatingBean {
    /**
     * max : 10
     * average : 9.2
     * stars : 50
     * min : 0
     */

    private int max;
    private double average;
    private String stars;
    private int min;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public String toString() {
        return "RatingBean{" +
                "max=" + max +
                ", average=" + average +
                ", stars='" + stars + '\'' +
                ", min=" + min +
                '}';
    }
}
