package ex_entrada_salida;

import java.util.Scanner;

public class Exercise7 {

    public void run() {
        try {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("How much was the bill");
            String bill = myObj.nextLine();  // Read user input

            double tax = 0.7;

            System.out.println(Double.parseDouble(bill) + (Double.parseDouble(bill) * tax));

        } catch (NumberFormatException e) {
            System.out.println("The quantity you typed was incorrect");
        }
    }
}
