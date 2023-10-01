package main;

import ex_basicos.*;
import ex_entrada_salida.Exercise11;
import ex_entrada_salida.Exercise13;
import ex_entrada_salida.Exercise7;
import ex_entrada_salida.Exercise9;
import group.Group;
import menu.Menu;
import ui.IO;
import ui.Validation;
import exercise.*;
import ui.console.Consoleio;

import java.util.ArrayList;

//TODO I think the way I get and use the inputs could be improved
public class Main {
    public static void main(String[] args) {

        IO io = new Consoleio();
        Validation validation = new Validation();

        final Group groupBasico = new Group();
        {
            groupBasico.add(new Exercise1(io));
            groupBasico.add(new Exercise3(io));
            groupBasico.add(new Exercise5(io));
        }

        final Group groupEntradaSalida = new Group();
        {
            groupEntradaSalida.add(new Exercise1(io));
            groupEntradaSalida.add(new Exercise3(io));
            groupEntradaSalida.add(new Exercise5(io));
            groupEntradaSalida.add(new Exercise7(io));
            groupEntradaSalida.add(new Exercise9(io));
            groupEntradaSalida.add(new Exercise11(io));
            groupEntradaSalida.add(new Exercise13(io));
        }

        final Group groupSwitch = new Group();
        {
            groupSwitch.add(new Exercise1(io));
            groupSwitch.add(new Exercise3(io));
            groupSwitch.add(new Exercise5(io));
            groupSwitch.add(new Exercise7(io));
            groupSwitch.add(new Exercise9(io));
            groupSwitch.add(new Exercise11(io));
            groupSwitch.add(new Exercise13(io));
        }
        ArrayList<Group> groups = new ArrayList<Group>();
        groups.add(groupBasico);
        groups.add(groupEntradaSalida);
        groups.add(groupSwitch);

        Menu menu = new Menu(groups, io);
        boolean running = false;

        menu.startMenu();
        if (io.read() == "y") {
            running = true;
        }

        while (running) {
            io.write("Available options");
            menu.menuListGroups();
            int group = validation.getInt(io.read());

            menu.menuListExercises(group);
            int number = validation.getInt(io.read());

            menu.selectExercise(group, number).run();

            io.write("Continue?\ny/n?");
            if (io.read() == "n") {
                running = false;
            }
            menu.exitMenu();
        }
    }

//    public static void start() {
//        menu.startMenu();
//        if (io.read() == "y") {
//            running = true;
//            runSelection();
//        }
//    }
//
//    private static void runSelection() {
//        while (running) {
//            selection().run();
//
//            io.write("Continue?\ny/n?");
//            if (io.read() == "n") {
//                running = false;
//            }
//        }
//        menu.exitMenu();
//    }
//
//    private static Exercise selection() {
//
//        io.write("Available options");
//        menu.menuListGroups();
//        int group = validation.getInt(io.read());
//        menu.menuListExercises(group);
//        int number = validation.getInt(io.read());
//
//        return menu.selectExercise(group, number);
//    }
}
