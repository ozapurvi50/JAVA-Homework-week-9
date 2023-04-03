package javaweek9homework;                             //package name

import java.util.Arrays;                               //Arrays import

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3 {                            // Class name
    public static void main(String[] args) {          //Main method
        int [] arr = {1,2,3,4,5,6};                  // defined arrays
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));    //print statement
    }
    public static void reverseArray(int [] arr){
        int start = 0;                               //initialing integer
        int end = arr.length -1;
        while (start < end){                        //while loop
            int temp = arr [start];
            arr[start] = arr [end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
