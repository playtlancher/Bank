package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Users {
    Scanner scan = new Scanner(System.in);
    int b;
    String a;
    List<User> list = new ArrayList<User>();
    public void score(){
        for ( User u : list){
            System.out.print(u.getName() + " - ");
            System.out.println(u.getScore());
        }
    }
    public void users(){
        Collections.sort(list ,new ComparatorByName());
        for ( User u : list){
            System.out.print(u.getName());
        }
    }
    public void tax(){
        for(User u : list){
            System.out.println(u.tax());
        }
    }
    public void addUser(){
        System.out.println("Enter name");
        a = scan.nextLine();
        System.out.println("Enter score");
        b = scan.nextInt();
        list.add(new User(a , b));
    }
}
