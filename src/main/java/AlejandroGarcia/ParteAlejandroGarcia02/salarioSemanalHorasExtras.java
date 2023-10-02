package AlejandroGarcia.ParteAlejandroGarcia02;

import java.util.Scanner;

public class salarioSemanalHorasExtras {

    public static double calcularSalarioSemanal(int horasTrabajadas) {
        double resultado = 0.0;
        if (horasTrabajadas <= 40) {
            resultado += horasTrabajadas * 12;
        }
        else {
            double horasExtras;
            horasExtras = horasTrabajadas - 40.0;
            resultado += (40.0 * 12) + (horasExtras * 16);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas en la semana: ");

        int horasTrabajadas = scanner.nextInt();
        System.out.println("El salario semanal de: " + horasTrabajadas + " es igual a: " + calcularSalarioSemanal(horasTrabajadas));
        scanner.close();
    }
}
