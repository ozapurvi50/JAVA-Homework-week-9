package javaweek9homework;                //package name

import java.util.HashMap;                //importing HashMap from util package
import java.util.Map;                    //importing Map from util package

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9 {                      //class name
    public static void main(String[] args) {         //Main method
            Programme_9 obj = new Programme_9();     //object creation
            obj.method();                            //Calling method using object
    }
        public void method(){                          //Instance method
        Map<String,Integer> people = new HashMap<>();
        people.put("Alice", 25);
        people.put("Bob", 30);
        people.put("charlie" , 35);
        people.put("Dave", 40);

        //Iterate over the values in the map using a for-each loop

        for(int age : people.values()){
            System.out.println("Age: " + age);
        }

    }
}
