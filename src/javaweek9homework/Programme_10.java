package javaweek9homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
// * Write a programme that tells you which line passes through particular stations.
// * Just use Zone 1 stations name.
// */
public class Programme_10 {

    public static void main(String[] args) {                    //Main method
        Scanner scan = new Scanner(System.in);                  //Scanner importing
        System.out.print("\n Enter station name :");
        String station = scan.nextLine();                       //integer defined for scanner input

        //Create a HashMap to store station names and their corresponding lines

        Map<String, String> lines = new HashMap<>();

        //Add each station and its corresponding lines to the HashMap


        lines.put("Oxford Circus(Bakerloo)", "Central / Victoria");
        lines.put("Leicester Square", "Central / Waterloo & City");
        lines.put("Bank", "Central/ Waterloo & City");
        lines.put("Cannon Street", "District");
        lines.put("Chancery Lane", "Central");
        lines.put("Charing Cross", "Bakerloo");
        lines.put("City Thameslink", "Thameslink");
        lines.put("Covent Garden", "Piccadilly");
        lines.put("Earl's Court", "District");
        lines.put("Edgware Road (Bakerloo)", "Bakerloo");
        lines.put("Edgware Road (Circle/District/Hammersmith & City)", "Circle/District/Hammersmith & City");
        lines.put("Elephant & Castle", "Bakerloo/Northern");
        lines.put("Embankment", "Bakerloo/Northern");
        lines.put("Euston", "Northern/Victoria");
        lines.put("Euston Square", "Circle/Hammersmith & City/Metropolitan");
        lines.put("Farringdon", "Circle/Hammersmith & City/Metropolitan");
        lines.put("Gloucester Road", "Circle/District/Piccadilly");
        lines.put("Goodge Street", "Northern");
        lines.put("Great Portland Street", "Circle/Hammersmith & City/Metropolitan");
        lines.put("Green Park", "Jubilee/Piccadilly/Victoria");


        if (lines.containsKey(station)) {                                 //if condition applied
            System.out.println("\n" + station + " Station is on the" + lines.get(station) + "line. ");
            System.out.println("\n Thank you for using this program! ");
            return;

        } else {
            System.out.println("\nSorry, this station is not in Zone 1.");  //Print statement
            System.out.println("\n Thank you for using this program! ");
            scan.close();
            return;
        }
    }

}

