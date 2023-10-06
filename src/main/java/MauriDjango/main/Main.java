package MauriDjango.main;

import MauriDjango.exercise.ex_entrada_salida.*;
import MauriDjango.exercise.ex_switch.Exercise15;
import MauriDjango.group.*;
import MauriDjango.menu.Menu;
import MauriDjango.ui.IO;
import MauriDjango.exceptions.InvalidInputException;
import MauriDjango.exercise.Exercise;
import exercise.ex_numeros_aleatorios.*;
import MauriDjango.exercise.ex_switch.Exercise17;
import MauriDjango.exercise.ex_switch.Exercise19;
import MauriDjango.exercise.ex_switch.Exercise21;
import group.*;
import MauriDjango.ui.console.Consoleio;
import java.util.ArrayList;

//TODO Still not sure why double spaced between groups and exercises

/**
 * This is the main class of the program responsible for executing exercises
 * from various groups through a menu system.
 */
public class Main {
    public static void main(String[] args) throws InvalidInputException {

        boolean running = false;
        IO io = new Consoleio();

        // Create instances of different exercise groups
        final Group groupBasico = new GroupBasicos();
        groupBasico.add(
                new MauriDjango.exercise.ex_basicos.Exercise1(io),
                new MauriDjango.exercise.ex_basicos.Exercise3(io),
                new MauriDjango.exercise.ex_basicos.Exercise5(io)
        );

        final Group groupEntradaSalida = new GroupEntradaSalida();
        groupEntradaSalida.add(
                new Exercise1(io),
                new Exercise3(io),
                new Exercise5(io),
                new Exercise7(io),
                new Exercise9(io),
                new Exercise11(io),
                new Exercise13(io)
        );

        final Group groupSwitch = new GroupSwitch();
        groupSwitch.add(
                new MauriDjango.exercise.ex_switch.Exercise1(io),
                new MauriDjango.exercise.ex_switch.Exercise3(io),
                new MauriDjango.exercise.ex_switch.Exercise5(io),
                new MauriDjango.exercise.ex_switch.Exercise7(io),
                new MauriDjango.exercise.ex_switch.Exercise9(io),
                new MauriDjango.exercise.ex_switch.Exercise11(io),
                new MauriDjango.exercise.ex_switch.Exercise13(io),
                new Exercise15(io),
                new Exercise17(io),
                new Exercise19(io),
                new Exercise21(io)
        );

        final Group groupBucles = new GroupBucles();
        groupBucles.add(
                new MauriDjango.exercise.ex_bucles.Exercise1(io),
                new MauriDjango.exercise.ex_bucles.Exercise3(io),
                new MauriDjango.exercise.ex_bucles.Exercise5(io),
                new MauriDjango.exercise.ex_bucles.Exercise7(io),
                new MauriDjango.exercise.ex_bucles.Exercise9(io),
                new MauriDjango.exercise.ex_bucles.Exercise11(io),
                new MauriDjango.exercise.ex_bucles.Exercise13(io),
                new MauriDjango.exercise.ex_bucles.Exercise15(io),
                new MauriDjango.exercise.ex_bucles.Exercise17(io),
                new MauriDjango.exercise.ex_bucles.Exercise19(io),
                new MauriDjango.exercise.ex_bucles.Exercise21(io)
        );

        final Group groupNumAleatorios = new GroupNumerosAleatorios();
        groupNumAleatorios.add(
                new MauriDjango.exercise.ex_numeros_aleatorios.Exercise1(io),
                new MauriDjango.exercise.ex_numeros_aleatorios.Exercise3(io),
                new MauriDjango.exercise.ex_numeros_aleatorios.Exercise5(io),
                new MauriDjango.exercise.ex_numeros_aleatorios.Exercise7(io),
                new MauriDjango.exercise.ex_numeros_aleatorios.Exercise9(io),
                new MauriDjango.exercise.ex_numeros_aleatorios.Exercise11(io),
                new MauriDjango.exercise.ex_numeros_aleatorios.Exercise13(io),
                new MauriDjango.exercise.ex_numeros_aleatorios.Exercise15(io)
        );

        ArrayList<Group> groups = new ArrayList<>();
        groups.add(groupBasico);
        groups.add(groupEntradaSalida);
        groups.add(groupSwitch);
        groups.add(groupBucles);
        groups.add(groupNumAleatorios);

        Menu menu = new Menu(groups, io);

        menu.startMenu();

        running = io.getYN();

        while (running) {
            io.write("Available options");
            menu.listGroups();
            Group group = menu.selectGroup(io.getInt());

            menu.listExercises(group);
            Exercise exercise = menu.selectExercise(group, io.getInt());

            exercise.run();

            io.write("Continue?\ny/n?");

            running = io.getYN();

            menu.exitMenu();
        }
    }
}
