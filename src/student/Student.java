package student;

public class Student {

    private String surename;
    String getSurename(){
    return "Surname student one is: " + this.surename;
    }

    void setSurename(String surname) {
            if (surname.length() > 2) {
            this.surename = surname;
        }
    }

    private int rating;
    void setRating(int rating){
        if(rating >=1 && rating <=5){
        this.rating = rating;
        }
    }
    int getRating(){
        return this.rating = rating;
    }



}
