import java.util.Scanner;

public class WhatAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What's your name?: ");
        String name = scan.nextLine();
        System.out.println("Hello thar " + name);
    }
}