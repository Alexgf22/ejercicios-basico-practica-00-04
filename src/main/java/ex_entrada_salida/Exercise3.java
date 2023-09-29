package ex_entrada_salida;

import java.util.Scanner;
import static java.lang.Math.round;

public class Exercise3 {

    private double convert(int pesetas) {
        return round((pesetas * 0.00601012)*100.0)/100.0;
    }

    public void run() {
        try {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter quantity of pesetas");
            String pesetas = myObj.nextLine();  // Read user input

            System.out.println(convert(Integer.parseInt(pesetas)));
        } catch (NumberFormatException e) {
            System.out.println("The quantity you typed was incorrect");
        }
    }
}
