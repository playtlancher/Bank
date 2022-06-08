package com.company;
import java.util.Comparator;
public class Comparators {
    public static Comparator<User> getComparatorByName() {
        return new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.getName().compareTo(o1.getName());
            }
        };
    }
}
