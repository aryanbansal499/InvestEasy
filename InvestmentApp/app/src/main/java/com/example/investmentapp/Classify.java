package com.example.investmentapp;

import android.widget.ImageView;

import java.util.HashMap;

public class Classify {

    // collection of images of the investments
    private String[] imageID = {
            "https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjN88_dwJHmAhVDgOYKHdq9CzUQjRx6BAgBEAQ&url=https%3A%2F%2Fwww.domain.com.au%2Fnews%2Fsix-of-the-best-prestige-properties-for-sale-in-australia-right-now-20170615-gwhcp6%2F&psig=AOvVaw2lYwDDKAiHnnrm4j2COgff&ust=1575188539778986",
            "https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjw7rb1wJHmAhU46nMBHZVzCtQQjRx6BAgBEAQ&url=https%3A%2F%2Fwww.domain.com.au%2Fnews%2Fthe-best-properties-for-sale-around-australia-october-28-20151027-gkcds8%2F&psig=AOvVaw2lYwDDKAiHnnrm4j2COgff&ust=1575188539778986"
    };


    private Integer[] scores = new Integer[]{
            50,
            85
    };

    private ImageView iv;

    HashMap<Integer, String> map = new HashMap<Integer, String>();

    public  void generate() {

        for(int i=0;i<imageID.length;i++) {
            map.put(scores[i], imageID[i]);
        }

    }

    // match the scores and sort the hash map to the ordering of the user and display it
    public void matchAndDisplay() {

    }

    // generate the scores based on the classification data
    public void calculateScore() {

    }




}
