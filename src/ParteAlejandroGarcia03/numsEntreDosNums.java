package ParteAlejandroGarcia03;
import java.util.Scanner;

public class numsEntreDosNums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Los dos números han de ser distintos. Vuélvelo a intentar.");
            scanner.close();
            return;
        }

        int numeroMayor;
        int numeroMenor;

        numeroMayor = Math.max(numero1, numero2);
        numeroMenor = Math.min(numero1, numero2);
        int i;
        for(i = numeroMenor; i <= numeroMayor; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }


}
