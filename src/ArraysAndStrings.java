import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.Scanner;
import java.util.Arrays;


public class ArraysAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_arr = scanner.nextLine();
    }

    public boolean isUnique(String sentence){
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

}
