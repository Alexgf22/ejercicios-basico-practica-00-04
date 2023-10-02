package ParteAlejandroGarcia00;

/*Ejercicio 4
Realiza un conversor de euros a pesetas.
La cantidad en euros que se quiere convertir
deberá estar almacenada en una variable.
 */
public class conversorEuroApeseta {

    public static void main(String[] args) {
        double euros = 50.0;
        double equivalenciaPesetasEuro = 166.386;

        double pesetas = euros * equivalenciaPesetasEuro;

        System.out.println(euros + " euros al cambio son:  " + pesetas + " pesetas.");
    }

}
