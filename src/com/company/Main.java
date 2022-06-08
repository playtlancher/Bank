package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 0 ;
        String name ;
        Users user = new Users();
        Scanner scan = new Scanner(System.in);

        while (true) {
            switch (a) {
                case 0:
                    System.out.println("1 - add user");
                    System.out.println("2 - watch list");
                    System.out.println("3 - watch score");
                    System.out.println("4 - watch tax");
                    a = scan.nextInt();
                    break;
                case 1:
                    user.addUser();
                    a = 0;
                    break;
                case 2:
                    user.users();
                    a = 0;
                    break;
                case 3:
                    user.score();
                    a = 0;
                    break;
                case 4:
                    user.tax();
                    a = 0;
                    break;
            }
        }
    }
}