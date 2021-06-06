
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex15 {
    public static String password = "abc$123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What your username? ");
        String name = scanner.nextLine();
        System.out.println("What is the password? ");
        String input = scanner.nextLine();

        if(input.equals(password)){
            System.out.println("Welcome," + name + "!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}