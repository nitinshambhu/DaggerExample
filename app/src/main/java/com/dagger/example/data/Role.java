package com.dagger.example.data;



public class Role {

    public String getDesignation() {
        return designation;
    }

    public int getRate() {
        return rate;
    }

    public int getPeriodInDays() {
        return periodInDays;
    }

    String designation;
    int rate;
    int periodInDays;

    public Role(String designation, int rate, int periodInDays) {
        this.designation = designation;
        this.rate = rate;
        this.periodInDays = periodInDays;
    }


}
