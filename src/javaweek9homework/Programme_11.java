package javaweek9homework;                           //package name

import java.util.ArrayList;                          //importing Arraylist

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11 {                                //Class name

    public static void main(String[] args) {                //Main method
        Programme_11 obj = new Programme_11();             //created object
        obj.method();                                      //calling method with object
    }
    public void method() {                                 //instance method

        ArrayList<String> c1 = new ArrayList<String>();         //first array list
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();          //Second array list
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        if (c1.equals(c2)) {                                 //if condition applied
            System.out.println("c1 and c2 are equal ");
        } else {                                             //if condition is not true, else statement applies
            System.out.println("C1 and c2 are not equal");
        }
    }

}
