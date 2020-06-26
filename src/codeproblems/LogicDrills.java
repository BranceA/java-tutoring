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

    private static int sum(int x, int y){
        return x - (-1 * y);
    }

//    Find maximum, minimum of three numbers without using conditional statement and/or ternary operator

    // Find minimum and max of three numbers
    // No conditional statement no ifs switch
    // no ternary
    // Write the method
    // three numbers

    private static void findMinAndMax(int num1, int num2, int num3){
        // I don't what order they're in
        // 1 is the biggest and 1 is smallest
        // What if I can sort them from smallest to largest
        // How sort things? I can sort arrays

        List<Integer> myNumbers = new ArrayList<>();

        myNumbers.add(num1);
        myNumbers.add(num2);
        myNumbers.add(num3);

        // My ArrayList has all numbers in it
        Collections.sort(myNumbers);

        System.out.println("The max is: " + myNumbers.get(2));
        System.out.println("The min is: " + myNumbers.get(0));
    }

//    Determine if two integers are equal without using comparison and arithmetic operators

    // Have two numbers. Tell if they're equal. return boolean
    // No comparison and aritmhetic operators
    // No != == > < <= >=
    // No * + - / Math.Anything()

    // Given two ints
    private static boolean isEqual(int firstNumber, int secondNumber){

            String string1 = Integer.toString(firstNumber);
            String string2 = Integer.toString(secondNumber);

            return string1.matches(string2);
    }

//    Print a colon without using a colon anywhere in the program

    private static void printColon(){
        char aa = '\u003A';
        System.out.println(aa);
    }

//    Find if a number is even or odd without using any conditional statement
    // number is even or odd
    // No conditional statement
    // no ifs no ternary no conditions

    private static void isEvenOrOdd(int number){
        // even % 2 == 0
        // odd % 2 == 1
        // can't use if
        // Don't use if statement. I still get 1 or 0
        // How can I use 1 or 0 without using an if?
        // index points
        String[] outcomes = {"Even", "Odd"};

        System.out.println(outcomes[number % 2]);
    }


    // Given an integer, print every prime number from 1 to that integer
    // https://codingpuzzles.com/

    // I have an int
    // Start printing prime numbers
    // Starting at 1
    // ending at that int that I got earlier

//    private static void printPrimeNumbers(int theInteger){
//
//        for(int i = 1; i <= theInteger; i++){
//            // How do I check for prime number?
//            // Prime number is a number that is only divisible by itself and 1
//            // 7 is prime. 7 % 1 == 0 | 7 / 2 == 0
//            // Only 2 factors
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//    }

//    private static boolean isPrime(int numberToCheck){
//        List<Integer> factors = new ArrayList<>();
//        for(int i = 1; i <= numberToCheck; i++){
//            if(numberToCheck % i == 0){
//                factors.add(i);
//            }
//        }
//        return factors.size() == 2;
//    }









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
    public static int duplInt(int[] intArr) {
        int dupNum = 0;
        for(int i = 0; i < intArr.length; i++){
            for(int j = i + 1; j < intArr.length; j++){
                if (intArr[i] == intArr[j]) {
                    dupNum += intArr[i];
                }
            }
        }
        return dupNum;
    }

    // in an array of integers from 1 to 10 find the missing number
    public static int findInt (int[] intArr) {
        int total_num = intArr.length + 1;
        int expected_sum = total_num * (total_num + 1) / 2;
        int sum = 0;
        for (int value : intArr) {
            sum += value;
        }
        return expected_sum - sum;
    }

    private static int findMissing(int[] intArray){
        int missingInt = 10;
        for(int i = 0; i < 8; i++){
            if(intArray[i + 1] != intArray[i] + 1){
                missingInt = intArray[i] + 1;
            }
        }
        return missingInt;
    }

    //    Write a method which will remove any given character from a String
    private static String removeCharacter(String str, char c){
        String newStr = "";
        for (int i = 0, n = str.length(); i < n; i++) {
            char x = str.charAt(i);
            if (x == c) {
                continue;
            } else {
                newStr += x;
            }
        }
        return newStr;
    }

    public static String removeChar(String sentence, String removeChar){
        String[] sentenceArr = sentence.split("");
        StringBuilder finalSentence = new StringBuilder();
        for(String letter : sentenceArr){
            if(!letter.equalsIgnoreCase(removeChar)) {
                finalSentence.append(letter);
            }
        }
        return finalSentence.toString();
    }

}