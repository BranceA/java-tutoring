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

    private static int weirdSum(int x, int y){
        return x - (-1 * y);
    }

//    Find maximum, minimum of three numbers without using conditional statement and/or ternary operator

    private static void findMinAndMax(int num1, int num2, int num3){
        ArrayList<Integer> sortArray = new ArrayList<>();
        sortArray.add(num1);
        sortArray.add(num2);
        sortArray.add(num3);

        Collections.sort(sortArray);

        System.out.printf("The maximum number is %d and the minimum is %d%n", sortArray.get(2), sortArray.get(0));
    }

//    Determine if two integers are equal without using comparison and arithmetic operators

    private static boolean areIntsEqual(int num1, int num2){
        String string1 = Integer.toString(num1);
        String string2 = Integer.toString(num2);

        return string1.matches(string2);
    }

//    Print a colon without using a colon anywhere in the program

    private static void printColon(){
        char colon = '\u003a';
        System.out.println(colon);
    }

//    Find if a number is even or odd without using any conditional statement

    private static void isEvenOrOdd(int num){
        String[] outcomes = {"even", "odd"};
        int indexPoint = Math.abs(num % 2);

        System.out.println(outcomes[indexPoint]);
    }

    // Given an integer, print every prime number from 1 to that integer
    // https://codingpuzzles.com/

    private static void printPrimes(int stoppingPoint){
        for(int i = 0; i < stoppingPoint; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num){
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                factors.add(i);
            }
        }
        return factors.size() == 2;
    }

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

    private static long voltronNumber(ArrayList<Integer> numbers){

        String numberString = "";
        for(Integer number : numbers){
            numberString += number;
        }


        char[] charArray = numberString.toCharArray();
        Arrays.sort(charArray);


        String output = "";
        for(int i = charArray.length - 1; i >= 0; i--){
            output += charArray[i];
        }

        return Long.parseLong(output);
    }

//    There's a staircase with N steps, and you can climb 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
//
//    For example, if N is 4, then there are 5 unique ways:
//
//            1, 1, 1, 1
//            2, 1, 1
//            1, 2, 1
//            1, 1, 2
//            2, 2
//    What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time. Generalize your function to take in X.
}

//    https://www.java67.com/2018/05/top-75-programming-interview-questions-answers.html

//    find the duplicate number on a given integer array

    // in an array of integers from 1 to 10 find the missing number

//    Write a method which will remove any given character from a String

    //https://codingpuzzles.com/floyd-triangle-5231615d5c4d

    //Write a method that accepts an integer and prints that many rows of a Floyd Triangle

// This is what a Floyd Triangle looks like
//            1
//            2 3
//            4 5 6
//            7 8 9 10


    // from Brance

    // Write a function that takes stupid MySQL dates (example: 1234-56-78) and turns them into normal dates (example: 78-56-1234)

    // Write a function that accepts an array of strings and a string. if the array doesn't contain the given string add the string to the array. Return the array either way.

    // write a function that accepts a matrix of integers and returns the array from the matrix with the highest sum of all elements
    // example [
    //          [1, 2, 3],
    //          [4, 5, 6],
    //          [7, 8, 9]     <----- return this array because 7 + 8 + 9 the highest sum of all elements
    //         ]

//    // Swap two numbers without using a third variable
//    private static void swapTwoNumbers(int num1, int num2){
//        num1 = num1 * num2;
//        num2 = num1/num2;
//        num1 = num1/num2;
//
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//    }