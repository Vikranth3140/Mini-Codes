// package com.company;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("taking input from user");

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter number1: ");
            int a= sc.nextInt();
            System.out.println("Enter number2: ");
            int b= sc.nextInt();
            int sum=a+b;

            System.out.print("The sum of the two numbers is: ");
            System.out.println(sum);
        }
        finally{
            sc.close();
        }
    }
}

