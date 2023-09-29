package ui;

public class Validation {
    //TODO Check and rework complexity
    public static int getInt(String string)  throws NumberFormatException {
        Integer input = null;
        while (input == null) {
            try {
                input = Integer.parseInt(string);  // Read user input
            } catch (NumberFormatException e) {
                System.out.println("The number you entered was incorrect");
            }
        }
        return input;
    }
}
