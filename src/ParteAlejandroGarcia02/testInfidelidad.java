package ParteAlejandroGarcia02;

import java.util.Scanner;

public class testInfidelidad {

    public static void main(String[] args) {
        try {
            String[] preguntas = {
                    "¿Tu pareja ha dejado de compartir detalles sobre su vida cotidiana o eventos importantes?",
                    "¿Tu pareja ha empezado a tener reuniones privadas con una persona en particular sin invitarte?",
                    "¿Tu pareja ha cambiado la forma en que te comunica sus planes o actividades, y ahora es menos transparente?",
                    "¿Tu pareja ha dejado de compartir sus sentimientos o pensamientos contigo?",
                    "¿Tu pareja ha mostrado interés excesivo en conocer a alguien nuevo sin una razón clara?"
            };

            // Realizar preguntas y calculamos los puntos
            int puntos = hacerPreguntas(preguntas);

            // Conclusión
            determinarConclusion(puntos);
        } catch (Exception e) {
            System.out.println("Error en el programa: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static int hacerPreguntas(String[] preguntas) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        for (int i = 0; i < preguntas.length; i++) {
            String pregunta = preguntas[i];

            System.out.println("Pregunta " + (i + 1) + ": " + pregunta);
            System.out.print("(Verdadero/Falso): ");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase("Verdadero")) {
                puntos += 3;
            }
        }

        return puntos;
    }

    public static void determinarConclusion(int puntos) {
        String respuesta1 = "Las respuestas no parecen indicar una infidelidad en este momento.";
        String respuesta2 = "Las respuestas sugieren que tu pareja podría estar siéndote infiel.";
        String respuesta3 = "Hay indicios de que tu pareja podría estar siendo infiel. Te recomendamos tener una conversación abierta con tu pareja sobre tus preocupaciones.";

        if (puntos <= 3) {
            System.out.println(respuesta1);
        } else if (puntos <= 9) {
            System.out.println(respuesta2);
        } else {
            System.out.println(respuesta3);
        }
    }

}

