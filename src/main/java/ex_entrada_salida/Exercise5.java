package ex_entrada_salida;

import java.util.Scanner;

public class Exercise5 {

    public void run() {
        try {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter length");
            String length = myObj.nextLine();  // Read user input

            System.out.println("Enter width");
            String width = myObj.nextLine();  // Read user input

            System.out.println(Integer.parseInt(length) * Integer.parseInt(width));

        } catch (NumberFormatException e) {
            System.out.println("The quantity you typed was incorrect");
        }
    }
}
