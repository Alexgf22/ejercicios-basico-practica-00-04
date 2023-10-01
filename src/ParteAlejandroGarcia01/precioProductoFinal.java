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
public class precioProductoFinal {


    // Calculamos el IVA del producto
    public static double calcularIVA(double baseImponible, String tipoIva) {
        double iva = 0.0;
        if(Objects.equals(tipoIva, "general")) {
            iva += baseImponible * 0.21;
        }
        else if(Objects.equals(tipoIva, "reducido")) {
            iva += baseImponible * 0.1;
        }
        else if(Objects.equals(tipoIva, "superreducido")) {
            iva += baseImponible * 0.04;
        }
        iva = Math.round(iva);

        return iva;
    }

    // Calculamos el precio final tras añadir el IVA
    public static double calcularPrecioConIVA(double baseImponible, String tipoIva) {
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
        conIVA = Math.round(conIVA);

        // Devolvemos el precio con IVA
        return conIVA;

    }

    // Aplicamos descuento que requiera
    public static double precioFinalConDescuento(String codigoPromocional, double baseImponible, String tipoIva) {
        double conIVA = calcularPrecioConIVA(baseImponible, tipoIva);
        // Ahora al precio con IVA le aplicamos el descuento si corresponde
        if (Objects.equals(codigoPromocional, "mitad")) {
            conIVA = conIVA / 2;
        }
        else if(Objects.equals(codigoPromocional, "meno5")) {
            conIVA -= 5;
        }
        else if(Objects.equals(codigoPromocional, "5porc")) {
            conIVA -= (conIVA * ((double) 5 / 100));
        }
        else {
            conIVA -= 0;
        }

        return conIVA;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la base imponible: ");
        int baseImponible = scanner.nextInt();

        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = scanner.next();

        int porcentajeIVA = 0;
        if (Objects.equals(tipoIVA, "general")) {
            porcentajeIVA += 21;
        }
        else if (Objects.equals(tipoIVA, "reducido")) {
            porcentajeIVA += 10;
        }
        else if (Objects.equals(tipoIVA, "superreducido")) {
            porcentajeIVA += 4;
        }


        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = scanner.next();

        double cantidadDescuento = 0;
        if (Objects.equals(codigoPromocional, "nopro")) {
            cantidadDescuento += 0;
        }
        else if (Objects.equals(codigoPromocional, "mitad")) {
            cantidadDescuento += calcularPrecioConIVA(baseImponible, tipoIVA) / 2;
        }
        else if (Objects.equals(codigoPromocional, "meno5")) {
            cantidadDescuento -= 5;
        }
        else if (Objects.equals(codigoPromocional, "5porc")) {
            cantidadDescuento -= (calcularPrecioConIVA(baseImponible, tipoIVA) * ((double) 5 / 100));
        }

        System.out.println("Base imponible \n"+ baseImponible);
        System.out.println("IVA (" + porcentajeIVA + "%) \n" + calcularIVA(baseImponible,tipoIVA));
        System.out.println("Precio con IVA \n" + calcularPrecioConIVA(baseImponible, tipoIVA));
        System.out.println("Cód. promo. (" + codigoPromocional + "): " + "-" + cantidadDescuento);
        System.out.println("TOTAL \n" + precioFinalConDescuento(codigoPromocional, baseImponible, tipoIVA));

        scanner.close();
    }


}
