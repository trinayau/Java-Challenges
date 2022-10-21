package Fizzbuzz;

import java.util.Scanner;
//if num divisible by 3 and 5, print Fizzbuzz
//if num divisible by 3, print Fizz
//if num divisible by 5, print Buzz
//otherwise print number
//First find the most demanding condition, and implement it.

public class Fizzbuzz {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.valueOf(reader.nextLine());
        if(number % 3 == 0 && number % 5 ==0){
            System.out.println("FizzBuzz");
        } else if(number % 3 == 0){
            System.out.println("Fizz");
        } else if(number % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

    }


}
