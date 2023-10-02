package main;

import group.*;
import menu.Menu;
import ui.IO;
import ui.Validation;
import ui.console.Consoleio;
import java.util.ArrayList;
import java.util.Objects;

/**
 * This is the main class of the program responsible for executing exercises
 * from various groups through a menu system.
 */
public class Main {
    public static void main(String[] args) {

        boolean running = false;
        IO io = new Consoleio();
        Validation validation = new Validation();

        // Create instances of different exercise groups
        final Group groupBasico = new GroupBasicos();
        groupBasico.add(
                new ex_basicos.Exercise1(io),
                new ex_basicos.Exercise3(io),
                new ex_basicos.Exercise5(io)
        );

        final Group groupEntradaSalida = new GroupEntradaSalida();
        groupEntradaSalida.add(
                new ex_entrada_salida.Exercise1(io),
                new ex_entrada_salida.Exercise3(io),
                new ex_entrada_salida.Exercise5(io),
                new ex_entrada_salida.Exercise7(io),
                new ex_entrada_salida.Exercise9(io),
                new ex_entrada_salida.Exercise11(io),
                new ex_entrada_salida.Exercise13(io)
        );

        final Group groupSwitch = new GroupSwitch();
        groupSwitch.add(
                new ex_switch.Exercise1(io),
                new ex_switch.Exercise3(io),
                new ex_switch.Exercise5(io),
                new ex_switch.Exercise7(io),
                new ex_switch.Exercise9(io),
                new ex_switch.Exercise11(io),
                new ex_switch.Exercise13(io),
                new ex_switch.Exercise15(io),
                new ex_switch.Exercise17(io),
                new ex_switch.Exercise19(io),
                new ex_switch.Exercise21(io)
        );

        final Group groupBucles = new GroupBucles();
        groupBucles.add(
                new ex_bucles.Exercise1(io),
                new ex_bucles.Exercise3(io),
                new ex_bucles.Exercise5(io),
                new ex_bucles.Exercise7(io),
                new ex_bucles.Exercise9(io),
                new ex_bucles.Exercise11(io),
                new ex_bucles.Exercise13(io),
                new ex_bucles.Exercise15(io),
                new ex_bucles.Exercise17(io),
                new ex_bucles.Exercise19(io),
                new ex_bucles.Exercise21(io)
        );

        final Group groupNumAleatorios = new GroupNumerosAleatorios();
        groupNumAleatorios.add(
                new ex_numeros_aleatorios.Exercise1(io),
                new ex_numeros_aleatorios.Exercise3(io),
                new ex_numeros_aleatorios.Exercise5(io),
                new ex_numeros_aleatorios.Exercise7(io),
                new ex_numeros_aleatorios.Exercise9(io),
                new ex_numeros_aleatorios.Exercise11(io),
                new ex_numeros_aleatorios.Exercise13(io),
                new ex_numeros_aleatorios.Exercise15(io)
        );

        ArrayList<Group> groups = new ArrayList<>();
        groups.add(groupBasico);
        groups.add(groupEntradaSalida);
        groups.add(groupSwitch);
        groups.add(groupBucles);
        groups.add(groupNumAleatorios);

        Menu menu = new Menu(groups, io);

        menu.startMenu();
        if (Objects.equals(io.read(), "y")) {
            running = true;
        }

        while (running) {
            io.write("Available options");
            menu.menuListGroups();
            int group = Validation.getInt(io.read());

            menu.menuListExercises(group);
            int number = Validation.getInt(io.read());

            menu.selectExercise(group, number).run();

            io.write("Continue?\ny/n?");
            if (Objects.equals(io.read(), "n")) {
                running = false;
            }
            menu.exitMenu();
        }
    }
}
