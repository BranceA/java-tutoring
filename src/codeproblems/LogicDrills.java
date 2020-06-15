package codeproblems;

import java.util.ArrayList;
import java.util.Collections;

public class LogicDrills {
    public static void main(String[] args) {
        isEvenOrOdd(4);
        isEvenOrOdd(19);
        isEvenOrOdd(-50);
        isEvenOrOdd(-27);
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



}
