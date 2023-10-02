package AlejandroGarcia.ParteAlejandroGarcia03;

public class primosEntreDosYcien {

    public static boolean esPrimo(int num) {

        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 100;

        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

}
