package codeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LogicDrills {
    public static void main(String[] args) {

    }

//    https://medium.com/@codingfreak/top-25-programming-puzzles-and-brain-teasers-dac17b41e94a

//    Add two numbers without using addition operator

//    Find maximum, minimum of three numbers without using conditional statement and/or ternary operator

//    Determine if two integers are equal without using comparison and arithmetic operators

//    Print a colon without using a colon anywhere in the program

//    Find if a number is even or odd without using any conditional statement


    // Given an integer, print every prime number from 1 to that integer
    // https://codingpuzzles.com/

//    private static void printPrimes(int stoppingPoint) {
//        for (int number = 2; number <= stoppingPoint; number++) {
//            //print prime numbers only
//            if (isPrime(number)) {
//                System.out.println(number);
//            }
//        }
//    }
//
//    public static boolean isPrime(int number){
//        //for(int i=2; i<number; i++)
//        if (number % 2 == 0){
//            return false;
//            //number is divisible so its not prime
//        }
//        for (int i = 3; i < Math.sqrt(number); i+=2){
//            if(number%i == 0){
//                return false; //number is
//                //divisible so its not prime
//            }
//        }
//        return true; //number is prime now
//    }

    //Old way of doing things

//    private static void printPrimes(int stoppingPoint) {
//        for(int i = 0; i < stoppingPoint; i++) {
//            List<Integer> factors = new ArrayList<>();
//            for(int j = 1; j <= i; j++){
//                if(i % j == 0){
//                    factors.add(i);
//                }
//            }
//            if(factors.size() == 2){
//                System.out.println(i);
//            }
//        }
//    }

// http://www.crazyforcode.com/oyo-interview-questions-set-2/
//    Given an array of numbers arrange it in the form of a single number such that the concluded number is
//    the maximum.
//    e.g. given : 99,8,76,45,66,9,7,33,5,42
//    O/P : 99987766654233


    ////////////////////////////////////////////////////////////////////////////////////////

    //    find the duplicate number on a given integer array

    // in an array of integers from 1 to 10 find the missing number

    //    Write a method which will remove any given character from a String

}