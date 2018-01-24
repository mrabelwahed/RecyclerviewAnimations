package com.ramadan_apps.recyclerviewanimations;

/**
 * Created by Mahmoud Ramadan on 1/23/18.
 */

public class Movie {

    private String name;
    private int resId;


    public Movie(String name , int resId){
        this.name = name;
        this.resId =resId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
