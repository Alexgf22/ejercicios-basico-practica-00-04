package ParteAlejandroGarcia04;

import java.util.Random;

public class cartaAleatoria {

    public static String obtenerCarta() {
        String[] palos = {"picas", "corazones", "diamantes", "tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();
        int indiceAleatorio1 = random.nextInt(palos.length);
        String paloAleatorio = palos[indiceAleatorio1];

        int indiceAleatorio2 = random.nextInt(cartas.length);
        String cartaAleatoria = cartas[indiceAleatorio2];

        return "La carta aleatoria es: " + cartaAleatoria + " de " + paloAleatorio;
    }

    public static void main(String[] args) {

        System.out.println(obtenerCarta() );
    }

}
