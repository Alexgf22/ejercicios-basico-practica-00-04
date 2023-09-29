/*
package ParteAlejandroGarcia02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej16 {

    public static void main(String[] args) {
        try {
            // Cargar preguntas y respuestas desde el archivo
            String[] preguntasYRespuestas = cargarPreguntas();

            // Hacer preguntas y calcular puntos
            int puntos = hacerPreguntas(preguntasYRespuestas);

            // Determinar conclusión
            determinarConclusion(preguntasYRespuestas, puntos);
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo de preguntas y respuestas.");
            System.exit(1); // Terminar el programa
        }
    }

    public static String[] cargarPreguntas() throws IOException {
        String rutaArchivo = "ruta/del/archivo/test_infidelidad.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int contador = 0;

            // Contar líneas para determinar el tamaño del array
            while ((linea = br.readLine()) != null) {
                contador++;
            }

            // Volver a colocar el puntero al inicio del archivo
            br.close();
            br = new BufferedReader(new FileReader(rutaArchivo));

            String[] preguntasYRespuestas = new String[contador];

            contador = 0;

            // Leer preguntas y respuestas
            while ((linea = br.readLine()) != null) {
                preguntasYRespuestas[contador] = linea;
                contador++;
            }

            return preguntasYRespuestas;
        }
    }

    public static int hacerPreguntas(String[] preguntasYRespuestas) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        for (int i = 0; i < preguntasYRespuestas.length; i += 2) {
            String pregunta = preguntasYRespuestas[i];
            String respuesta = preguntasYRespuestas[i + 1];

            System.out.println("Pregunta " + (i / 2 + 1) + ": " + pregunta);
            System.out.print("(Verdadero/Falso): ");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(respuesta)) {
                puntos += 3;
            }
        }

        return puntos;
    }

    public static void determinarConclusion(String[] preguntasYRespuestas, int puntos) {
        int respuestasIndex = preguntasYRespuestas.length - 3; // Índice donde comienzan las respuestas
        String respuesta1 = preguntasYRespuestas[respuestasIndex];
        String respuesta2 = preguntasYRespuestas[respuestasIndex + 1];
        String respuesta3 = preguntasYRespuestas[respuestasIndex + 2];

        if (puntos <= 10) {
            System.out.println(respuesta1);
        } else if (puntos <= 20) {
            System.out.println(respuesta2);
        } else {
            System.out.println(respuesta3);
        }
    }
}
*/
