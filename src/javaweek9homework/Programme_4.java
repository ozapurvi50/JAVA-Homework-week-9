package javaweek9homework;                               //Package name

import java.util.ArrayList;                              //importing Array list
import java.util.Scanner;                                //importing scanner

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4 {                                 //Class name
    public static void main(String[] args) {               //Main method
        Scanner scan = new Scanner(System.in);             //Scanner calling object
        System.out.println("Enter the colour name: ");     //Print statement for user to input name in console
        String name = scan.nextLine();                     //integer defined to store input from console
        System.out.println("Enter the second colour name: ");
        String name1 = scan.nextLine();
        System.out.println("Enter the third colour name: ");
        String name2 = scan.nextLine();
        Programme_4 obj = new Programme_4();              //defined object to call method
        obj.colours(name,name1,name2);                    //Method calling through object creation
        scan.close();                                     //Scanner closing
    }
    public void colours(String name, String name1 , String name2 ) {   //instance method
        //create a new Arraylist of colors
        ArrayList<String> colors = new ArrayList<String>();

        //add some colors to the ArrayList
        colors.add(name);
        colors.add(name1);
        colors.add(name2);

        // print out the collection using a for-each loop
        for (String color : colors) {
            System.out.println(color);

        }

    }

}