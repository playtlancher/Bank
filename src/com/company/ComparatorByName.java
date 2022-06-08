package com.company;
import java.util.Comparator;
public class ComparatorByName implements Comparator<User>{
    @Override
    public int compare(User u, User u2) {
        return u.getName().compareTo(u.getName());
    }
}
