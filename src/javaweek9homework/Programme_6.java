package javaweek9homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6 {

    public static void main(String[] args) {         //Main method
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any digit from 0 to 6 : ");
        //Specify the index of the element to retrieve
        int index = scan.nextInt();
        Programme_6 obj = new Programme_6();          //Object creation
        obj.method1(index);                           //Method calling through object
        scan.close();                                 //Scanner closing
    }
    public void method1(int index) {                 //instance method
        //Create an array list
        ArrayList<String> list = new ArrayList<String>();

        //Add elements to the array list
        list.add(" _ ");
        list.add("Java");
        list.add("Selenium");
        list.add("RestAssured");
        list.add("Cucumber");
        list.add("Postman");
        list.add("SQL");

        //Retrieve the element at the specified index
        String element = list.get(index);

        //Print the element
        System.out.println("Element at index " + index + " : " + element);
    }

}
