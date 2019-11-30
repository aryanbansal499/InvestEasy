package com.example.investmentapp;

public class Investment_options implements Comparable< Investment_options > {


        private int id;
        private String title;
        private String shortdesc;
        private double score;
        private double price;
        private int image;

        public Investment_options(int id, String title, String shortdesc, double score, double price, int image) {
            this.id = id;
            this.title = title;
            this.shortdesc = shortdesc;
            this.score = score;
            this.price = price;
            this.image = image;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getShortdesc() {
            return shortdesc;
        }

        public double getRating() {
            return score;
        }

        public double getPrice() {
            return price;
        }

        public int getImage() {
            return image;
        }

        public void setScore(double score) { this.score = score; }

    @Override
    public int compareTo(Investment_options o) {
        if (this.getRating() > (o.getRating())) {
            return 1;
        }
        else if (this.getRating() < (o.getRating())) {
            return -1;
        }
        else
            return 0;
    }
}

