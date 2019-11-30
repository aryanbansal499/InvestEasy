package com.example.investmentapp;

import java.util.Collections;
import java.util.List;

public class Investments {


    public List<Investment_options> generateNewList(List<Investment_options> list, double score) {
        for(Investment_options var : list) {
            var.setScore(Math.abs((int)(var.getRating() - score)));
        }
        Collections.sort(list);
        return list;
    }
}
