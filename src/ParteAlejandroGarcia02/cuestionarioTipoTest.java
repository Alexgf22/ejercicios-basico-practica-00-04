package ParteAlejandroGarcia02;

import java.util.Scanner;

public class cuestionarioTipoTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;

        System.out.println("Cuestionario acerca del grado superior de Desarrollo de Aplicaciones Web");
        System.out.println("Responde con 'a', 'b' o 'c' según piense que sea la correcta.\n");

        // Pregunta num 1
        System.out.println("\n1. ¿Qué protocolo se utiliza para enviar datos desde un navegador a un servidor?");
        System.out.println("a) FTP");
        System.out.println("b) HTTP");
        System.out.println("c) SMTP");
        String respuesta1 = scanner.nextLine();
        if (respuesta1.equals("b")) {
            nota++;
        }

        // Pregunta num 2
        System.out.println("\n2. ¿Qué lenguaje se utiliza para estilizar páginas web?");
        System.out.println("a) HTML");
        System.out.println("b) CSS");
        System.out.println("c) JavaScript");
        String respuesta2 = scanner.nextLine();
        if (respuesta2.equals("b")) {
            nota++;
        }

        // Pregunta num 3
        System.out.println("\n3. ¿Qué lenguaje se utiliza para programar la lógica del lado del cliente en un sitio web?");
        System.out.println("a) HTML");
        System.out.println("b) CSS");
        System.out.println("c) JavaScript");
        String respuesta3 = scanner.nextLine();
        if (respuesta3.equals("c")) {
            nota++;
        }

        // Pregunta num 4
        System.out.println("\n4. ¿Qué lenguaje se utiliza para programar la lógica del lado del servidor en un sitio web?");
        System.out.println("a) HTML");
        System.out.println("b) CSS");
        System.out.println("c) Java");
        String respuesta4 = scanner.nextLine();
        if (respuesta4.equals("c")) {
            nota++;
        }

        // Pregunta num 5
        System.out.println("\n5. ¿Qué significa CSS?");
        System.out.println("a) Cascading Style Sheet");
        System.out.println("b) Creative Style Sheet");
        System.out.println("c) Computer Style Sheet");
        String respuesta5 = scanner.nextLine();
        if (respuesta5.equals("a")) {
            nota++;
        }

        // Pregunta num 6
        System.out.println("\n6. En el contexto del desarrollo web, ¿qué es Bootstrap?");
        System.out.println("a) Un lenguaje de programación orientado a objetos");
        System.out.println("b) Un framework de código abierto para diseño de sitios web");
        System.out.println("c) Una herramienta de control de versiones");
        String respuesta6 = scanner.nextLine();
        if (respuesta6.equals("b")) {
            nota++;
        }

        // Pregunta num 7
        System.out.println("\n7. ¿Qué significa DOM en desarrollo web?");
        System.out.println("a) Document Object Model");
        System.out.println("b) Data Object Model");
        System.out.println("c) Design Object Model");
        String respuesta7 = scanner.nextLine();
        if (respuesta7.equals("a")) {
            nota++;
        }

        // Pregunta num 8
        System.out.println("\n8. ¿Qué es una API?");
        System.out.println("a) Application Programming Interface");
        System.out.println("b) Advanced Programming Interface");
        System.out.println("c) Application Program Interface");
        String respuesta8 = scanner.nextLine();
        if (respuesta8.equals("a")) {
            nota++;
        }

        // Pregunta num 9
        System.out.println("\n9. ¿Qué es Git?");
        System.out.println("a) Un sistema de control de versiones");
        System.out.println("b) Un lenguaje de programación");
        System.out.println("c) Un editor de texto");
        String respuesta9 = scanner.nextLine();
        if (respuesta9.equals("a")) {
            nota++;
        }

        // Pregunta num 10
        System.out.println("\n10. ¿Qué es AJAX en desarrollo web?");
        System.out.println("a) Un lenguaje de programación");
        System.out.println("b) Una técnica para actualizar partes de una página sin recargarla");
        System.out.println("c) Un framework de JavaScript");
        String respuesta10 = scanner.nextLine();
        if (respuesta10.equals("b")) {
            nota++;
        }

        System.out.println("\nLa calificación obtenida: " + nota + " puntos sobre 10.");
    }
}
