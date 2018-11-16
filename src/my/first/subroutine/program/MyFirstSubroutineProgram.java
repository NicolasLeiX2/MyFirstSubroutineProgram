/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.first.subroutine.program;

import java.util.Scanner;

/**
 *
 * @author nilei4218
 */
public class MyFirstSubroutineProgram {

    /**
     * @param args the command line arguments
     */
    public static void addAndOut (int n1, int n2){
        int sum = n1 +n2;
        System.out.println("The sum is " + sum);
    }
    public static void taxAndOut(double n1, double n2){
        double tax = n1 * n2;
        System.out.println("Your tax will be " + tax);
    }
        public static void multAndOut (int n1, int n2){
        int prod = n1 * n2;
        System.out.println ("The product is " + prod);
    }
    public static void hypotAndOut(double n1, double n2){
        double hypot = Math.hypot (n1,n2);
        System.out.println("The hypotenuse is " + hypot);
    }
    public static void ageDifAndOut(int p1, int p2){
        int ageDiff = p1 - p2;
        System.out.println("The difference between person1 and person2" + ageDiff);
    }
            
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        int choice;
        
        System.out.println ("My First Subroutine Program");
        do{
        //asking user to select a subroutine
        System.out.println("Please select the mathematical calculations \n --------------------------------------");
        System.out.println("1. Find the sum of two numbers");
        System.out.println("2. Find the tax of your purchases");
        System.out.println("3. Find the product of two numbers");
        System.out.println("4. Find the hypotenuse");
        System.out.println("5. Find the age differenes between ");
        System.out.println("6...End program");
        System.out.println("--------------------------------------");
            
        choice = keyedInput.nextInt();
        
        if(choice == 1){
           System.out.println ("Enter the first number");
           int num1 = keyedInput.nextInt();
           
           System.out.println ("Enter the second number");
           int num2 = keyedInput.nextInt();
           
           addAndOut(num1,num2);
        }
        else if(choice == 2){
            System.out.println("Enter the cost");
            double num1 = keyedInput.nextInt();
            
            double num2 = 0.13;
            
            taxAndOut(num1 ,num2);
        }
        else if(choice ==3){
            System.out.println ("Enter the first number");
           int num1 = keyedInput.nextInt();
           
           System.out.println ("Enter the second number");
           int num2 = keyedInput.nextInt();
           
           multAndOut(num1,num2);
        }
        else if(choice == 4){
            System.out.println ("Enter the first number");
           int num1 = keyedInput.nextInt();
           
           System.out.println ("Enter the second number");
           int num2 = keyedInput.nextInt();
           
           hypotAndOut(num1,num2);
        }
        else if(choice == 5){
            System.out.println("Enter the older persons age");
            int num1 = keyedInput.nextInt();
            
            System.out.println("Enter the younger persons age");
            int num2 = keyedInput.nextInt();
            
            ageDifAndOut(num1, num2);
        }
        else if(choice == 6){
            System.out.println ("You have chosen to end the program");
            System.out.println ("Thank you and goodbye");
        }
    } while (choice != 6);
        }
}