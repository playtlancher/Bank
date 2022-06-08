package com.company;

public class User implements UserService {
    private String userName;
    private int score;
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public User(String name , int score){
        this.userName = name;
        this.score = score;
    }
    public double tax(){
        return score*0.05;
    }
    @Override
    public String getName(){
        return userName;
    }
}
