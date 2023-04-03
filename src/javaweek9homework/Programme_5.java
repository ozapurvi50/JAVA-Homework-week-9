package javaweek9homework;                   //Package name

import java.util.ArrayList;                  //importing Arraylist  from util package
import java.util.Iterator;                   //importing iterator from util package
import java.util.Scanner;                    //importing scanner  from util package

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */
public class Programme_5 {                                  //class name

    public static void main(String[] args) {                //main method
        Scanner scan = new Scanner(System.in);             //importing scanner
        System.out.println("Enter the colour name: ");     //Print statement for user to enter name
        String name = scan.nextLine();                     //defined variable to store value from console
        System.out.println("Enter the second fruit name: ");
        String name1 = scan.nextLine();
        System.out.println("Enter the third fruit name: ");
        String name2 = scan.nextLine();
        Programme_5 obj1 = new Programme_5();              //object creation
        obj1.method1(name, name1, name2);                  //calling method through object
        scan.close();                                      //Scanner close
    }

    public void method1(String name, String name1, String name2) {   //instance method
        //create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        //add some elements to the list
        list.add(name);
        list.add(name1);
        list.add(name2);

        //create an iterator for the list
        Iterator<String> iterator = list.iterator();

        //iterate through the list using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
