package ParteAlejandro00;

/*Ejercicio 4
Realiza un conversor de euros a pesetas.
La cantidad en euros que se quiere convertir
deberá estar almacenada en una variable.
 */
public class ejercicio4 {

    public static double conversor(int euros) {
        return 166.386 * euros;
    }


    public static void main(String[] args) {
        System.out.println(conversor(1000));
    }
}
