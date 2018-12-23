/*
======================================================================================
Author: Jin W. Chung
This is my practice for technical interview questions
from Cracking the Coding Interview by Gayle Laakmann Mcdowell
======================================================================================
 */

import java.util.Scanner;



public class ArraysAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_arr = scanner.nextLine();
        if(isUnique(input_arr)){
            System.out.println("The string is unique");
        } else {
            System.out.println("The string is not unique");
        }
        System.out.println("URL: " + URLify(input_arr));
    }

    public static boolean isUnique(String sentence){
        // implement an algorithm to determine if a string has all unique characters.
        char[] arr = sentence.toLowerCase().toCharArray();
        boolean unique = true;
        for (char c : arr) {
            // for every alphabet, check if there is more than one of each
            // time complexity: O(n^2)
            // can improve the performance with merge sort.
            int count = 0;
            for (char i : arr){
                if (c == i){
                    count++;
                }
            }
            if (count > 1){
                // if there is duplicate, return false
                unique = false;
            }
        }
        return unique;
    }

    public static String URLify(String name){
        /*
        method to replace all spaces in a string with "%20"
        ex) Jin Chung -> Jin%20Chung
         */
        char[] arr = name.toCharArray();
        String returnString = "";

        // I will go through each character in the string,
        // and concatenating appropriate piece to the
        // returning string.
        // time complexity: O^n
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ' '){
                returnString = returnString + "%20";
            } else {
                returnString = returnString + arr[i];
            }
        }
        return returnString;
    }

}
