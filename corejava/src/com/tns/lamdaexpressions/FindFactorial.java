package com.tns.lamdaexpressions;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number to find factorial");
        int num = sc.nextInt(); 

        // Lambda expression to calculate factorial
        Factorial factorial = (n)->{
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f = f * i; // calculate the factorial using for loop
            }
            return f;
        };

        // Call the lambda expression to calculate factorial
        int result = factorial.cal(num);
        System.out.print("Factorial of the " + num + " is " + result);
    }
}
