package ParteAlejandroGarcia01;

import java.util.Objects;
import java.util.Scanner;

/*
Ejercicio 12
Escribe un programa que calcule el precio final de un
producto según su base imponible (precio antes de impuestos),
el tipo de IVA aplicado (general, reducido o superreducido) y
el código promocional.
----
- IVA general: 21%
- IVA reducido: 10%
- IVA superreducido: 4%
----
- Código promocional: nopro (no promoción)
- Código promocional: mitad (precio - 50%)
- Código promocional: meno5 (precio - 5€)
- Código promocional: 5porc (precio - 5%)
----
El ejercicio
se da por bueno si se muestran los valores correctos, aunque los
números no estén tabulados.
Ejemplo:
Introduzca la base imponible: 25
Introduzca el tipo de IVA (general, reducido o superreducido): reducido
Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
Base imponible
25.00
IVA (10\%)
2.50
Precio con IVA
27.50
Cód. promo. (mitad): -13.75
TOTAL
13.75

 */
public class ej12 {

    public static String significadoCodigo(String codigoPromocional) {
        String resultado = "";
        if(Objects.equals(codigoPromocional, "nopro")) {
            resultado += "No se aplica promoción";
        } else if (Objects.equals(codigoPromocional, "mitad")) {
            resultado += "Mitad";
        }
        else if(Objects.equals(codigoPromocional, "meno5")) {
            resultado += "Descuento de 5€";
        } else if (Objects.equals(codigoPromocional, "5porc")) {
            resultado += "Descuento del 5%";
        }
        else {
            resultado += "No hay descuento";
        }
        return resultado;
    }

    public static double calcularPrecioFinal(double baseImponible, String tipoIva, String codigoPromocional) {
        double conIVA = 0.0;
        if(Objects.equals(tipoIva, "general")) {
            conIVA += baseImponible * 1.21;
        }
        else if(Objects.equals(tipoIva, "reducido")) {
            conIVA += baseImponible * 1.10;
        }
        else if(Objects.equals(tipoIva, "superreducido")) {
            conIVA += baseImponible * 1.04;
        }

        return conIVA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        int baseImponible = scanner.nextInt();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = String.valueOf(scanner.nextInt());

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String códigoPromocional = String.valueOf(scanner.nextInt());

        System.out.println("Base imponible \n");
        System.out.println("IVA (%) \n");
        System.out.println("Precio con IVA \n");
        System.out.println("Cód. promo. : \n");
        System.out.println("TOTAL \n");

        scanner.close();
    }


}
