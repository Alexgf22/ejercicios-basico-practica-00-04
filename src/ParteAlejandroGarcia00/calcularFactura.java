package ParteAlejandroGarcia00;/*
Escribe un programa que calcule el total de una factura
a partir de la base imponible (precio sin
IVA). La base imponible estará almacenada en una variable.

 */

public class calcularFactura {

    public static void main(String[] args) {

        double baseImponible = 100.0; //
        double iva = 0.21; //

        double total = baseImponible * (1 + iva);

        System.out.println("Base Imponible: " + baseImponible + " euros");
        System.out.println("IVA del (21%): " + (baseImponible * iva) + " euros");
        System.out.println("El total a pagar es de: " + total + " euros");
    }
}
