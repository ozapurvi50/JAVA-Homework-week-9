package javaweek9homework;             //Package name

import java.util.HashSet;                 //importing HastSet from util package

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8 {                     //Class name

    public static void main(String[] args) {     //Main method
        Programme_8 obj = new Programme_8();     //object creation
        obj.method();                            //method calling
    }
    public void method() {                       //instance method
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(8);

        for (int i = 1; i <= 10; i++) {               // for loop
            if (set.contains(i)) {                    //condition applied
                System.out.println(i + " is in the set");
            } else {
                System.out.println((i + " is not in the set"));
            }
        }
    }
}
