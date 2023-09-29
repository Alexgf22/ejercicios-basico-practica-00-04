package main;

import menu.Menu;
import ui.IO;
import ui.Validation;
import exercise.*;


//TODO I thinnk the way I get and use the inputs could be improved
public class Main {
    protected IO io;
    protected Validation validation;
    public Menu menu;
    private Boolean running = false;

    public Main(IO io, Validation validation, Menu menu) {
        this.io = io;
        this.validation = validation;
        this.menu = menu;
    }

    public void start() {
        menu.startMenu();
        if (io.read() == "y") {
            running = true;
            runSelection();
        }
    }

    private void runSelection() {
        while (running) {
            selection().run();

            io.write("Continue?\ny/n?");
            if (io.read() == "n") {
                running = false;
            }
        }
        menu.exitMenu();
    }

    private Exercise selection() {

        io.write("Available options");
        menu.menuListGroups();
        int group = validation.getInt(io.read());
        menu.menuListExercises(group);
        int number = validation.getInt(io.read());

        return menu.selectExercise(group, number);
    }
}

