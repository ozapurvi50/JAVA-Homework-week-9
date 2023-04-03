package javaweek9homework;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 */

public class Programme_2 {
    //Scanner declaration for reading input from console
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                    //Scanner import
        System.out.print("\n Enter Student name    \t\t:\t");
        String name = scan.nextLine();                           //integer defined for user entered name in console
        System.out.print(" Enter Student Roll Number \t\t:\t");
        int rollNum = scan.nextInt();                              //integer defined for user entered number in console
        System.out.print(" Enter Marks of subject Maths \t:\t");
        int mathsMarks = scan.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {              //Condition applied
            System.out.println(" \nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            mathsMarks = scan.nextInt();                          //integer defined for user entered marks in console
        }

        System.out.print("Enter Marks of subject Science \t:\t");
        int scienceMarks = scan.nextInt();
       while (scienceMarks < 0 || scienceMarks > 100) {                   //condition applied
            System.out.println(" \nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            scienceMarks = scan.nextInt();
        }

        System.out.print("Enter Marks of subject English \t:\t");
        int englishMarks = scan.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {               //condition applied
            System.out.println(" \nInvalid input, Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            englishMarks = scan.nextInt();
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scan.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c){

        return a+b+c;                               //return value
    }

   // Calculating the results on subjects marks

    public static String calculateResult(int mathsMarks, int scienceMarks,int englishMarks) {
        while (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {        //While loop
        }
        return "Pass";
    }
    //Calculating the grade on percentage and result

    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if(result.equalsIgnoreCase("Pass")) {        //if condition
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {                     //else condition
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            } else {
                grade = "-";
            }
        } return grade;                                    // return value
    }
    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }
}




