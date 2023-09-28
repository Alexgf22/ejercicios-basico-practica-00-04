package ParteAlejandroGarcia00;/*
Escribe un programa que calcule el total de una factura
a partir de la base imponible (precio sin
IVA). La base imponible estará almacenada en una variable.

 */

public class ej6 {

    public static double totalFactura(double baseImponible) {
        return baseImponible * 1.21;
    }

    public static void main(String[] args) {
        System.out.println(totalFactura(110.2));
    }
}
