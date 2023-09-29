package ex_entrada_salida;

import java.util.Scanner;

public class Exercise1 {
    public void run() {
        try {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter number 1");
            String num1 = myObj.nextLine();  // Read user input

            System.out.println("Enter number 2");
            String num2 = myObj.nextLine();  // Read user input

            System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));

        } catch (NumberFormatException e) {
            System.out.println("The quantity you typed was incorrect");
        }
    }
}
