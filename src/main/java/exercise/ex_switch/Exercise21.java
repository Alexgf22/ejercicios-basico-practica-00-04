package exercise.ex_switch;

import exercise.Exercise;
import ui.IO;
import ui.Validation;

import java.util.ArrayList;
import java.util.Objects;

public class Exercise21 extends Exercise {
    String exerciseName = "Exercise 21";
    String description = """
            Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas
            que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un
            número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media
            sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se
            califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de
            la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en
            caso contrario, se mantiene la nota media anterior. Ejemplo 1: Nota del primer control: 7 Nota del
            segundo control: 10 Tu nota de Programación es 8.5 Ejemplo 2: Nota del primer control: 6 Nota
            del segundo control: 3 ¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto Tu nota
            de Programación es 5 Ejemplo 3: Nota del primer control: 6 Nota del segundo control: 3 ¿Cuál ha
            sido el resultado de la recuperación? (apto/no apto): no apto Tu nota de Programación es 4.5
            """;

    {
        setExerciseName(exerciseName);
        setDescription(description);
        question.add("What was the result of the first test?");
        question.add("What was the result of the second test?");
        question.add("What was the result of the recuperacion? apto/no apto");
    }

    public Exercise21(IO io) {
        super(io);
    }

    @Override
    public void run() {
        ArrayList<String> inputs = getInputs();
        int test1 = io.toInt(inputs.get(0));
        int test2 = io.toInt(inputs.get(1));
        Boolean recup = Objects.equals(inputs.get(2), "apto");

        io.write("Your grade in programming is " + calculateGrade(test1, test2, recup));
    }

    private double calculateGrade(int num1, int num2, Boolean recup) {
        double grade = (double) (num1 + num2) / 2;
        if (grade >= 5) {
            return grade;
        } else if (recup) {
            return 5;
        } else {
            return grade;
        }
    }
}
