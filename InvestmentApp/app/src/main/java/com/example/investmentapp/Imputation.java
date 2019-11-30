package com.example.investmentapp;


// This class is responsible for getting relevant data from the user to calculate the score
// normalize it and return a score for the person
public class Imputation {
    String name;
    int income;
    int age;
    double nIncome;
    double nAge;
    // max income is capped at 100 Million
    final double MAX_INCOME = 100000000;

    // minimum income
    final double MIN_INCOME = 1000;

    // minimum age
    final double MIN_AGE = 18;

    // max age
    final double MAX_AGE = 100;

    public Imputation(int income, int age) {
        this.age = age;
        this.income = income;
    }

    public void getNormalizedIncome() {
        nIncome = (income - MIN_INCOME)/(MAX_INCOME - MIN_INCOME);
    }

    public void getNormalizedAge() {
        nAge = (age - MIN_AGE)/(MAX_AGE - MIN_AGE);
    }

    // It's a classification criteria to select the best suited investments for you
    public double getScore() {
        getNormalizedAge();
        getNormalizedIncome();
        return ((nIncome * 90)  + (nAge*10));
    }


}

