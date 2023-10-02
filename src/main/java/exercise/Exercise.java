package exercise;

import ui.IO;

import java.util.ArrayList;
import java.util.List;

public abstract class Exercise {

    protected final IO io;
    private String exerciseName;
    private String description;
    protected ArrayList<String> question = new ArrayList<>();

    public Exercise(IO io) {
        this.io = io;
    }

    public void displayDescription() {
        io.write(description);
    }

    public abstract void run();

    public Object getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
    this.description = description;
    }

    protected ArrayList<String> getInputs() {
        return io.getInputs(question);
    }
}
