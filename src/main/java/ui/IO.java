package ui;

import java.util.ArrayList;

public abstract class IO {

    public abstract void write(String message);
    public abstract String read();

    public ArrayList<String> getInputs(ArrayList<String> quesitons) {
        ArrayList inputs = new ArrayList();
        quesitons.forEach(question -> {
            write(question);
            inputs.add(read());
        });
        return inputs;
    }}
