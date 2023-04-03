package calculator;                                //package name
/**
 * Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;                         //importing scanner

public class Main extends Calculator {            //class name with parent class extension

    public static void main(String[] args) {       //main method
        Scanner scan = new Scanner(System.in);     //importing scanner
        char choice = 'Y';                         //variable char defined for user input
        while (choice == 'Y') {                    //while condition applied
            System.out.print("Enter first number : ");        //Statement for user to enter number
            int a = scan.nextInt();                           //defining value to integer from scanner
            System.out.print("Enter second number : ");
            int b = scan.nextInt();                          //defining value to integer from scanner
            System.out.println("Enter any symbol from  +,-,*,/");
            char c = scan.next().charAt(0);                 //defining value to integer from scanner
            Main obj = new Main();
            obj.calculateResult(a, b, c);                   //method calling
            System.out.print("Would you like to do more calculation enter Y for yes or N for no : ");
            choice = scan.next().charAt(0);                 //reading user input from console
        }
        scan.close();                                        //Scanner closing
        System.out.println("Program terminated. ");         //default statement print out.
    }
}







