package javaweek9homework;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme_7 {
    public static void main(String[] args) {
        Programme_7 obj = new Programme_7();
        obj.method1();
    }
    public boolean method1() {
        ArrayList<String> list = new ArrayList<String>();
        //add some elements to the list
        list.add("Honda");
        list.add("Mercedes");
        list.add("BMW");
        list.add("Toyota");
        list.add("Honda CRV");
        list.add("Audi");

        //check if the list is empty..if condition applied
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty. ");
            return true;
        } else {
            System.out.println("The ArrayList is not empty. ");
            return false;
        }
    }
}
