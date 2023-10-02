package ParteAlejandroGarcia01;

/*
Ejercicio 8
Escribe un programa que calcule el salario semanal de
un empleado en base a las horas trabajadas,
a razón de 12 euros la hora.
 */
public class salarioSemanal {

    public static double calcularSalarioSemanal(int horasTrabajadas) {
        return 12.0 * horasTrabajadas;
    }

    public static void main(String[] args) {
        System.out.println("El salario semanal cobrando 12€/hora sería: " + calcularSalarioSemanal(40) + "€");

    }
}
