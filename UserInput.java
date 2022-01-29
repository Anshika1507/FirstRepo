package com.example.userinput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner name= new Scanner(System.in);

        System.out.println("Enter your name:");
        String str = name.next();

        System.out.println("Hey Miss."+ str);
    }
}
