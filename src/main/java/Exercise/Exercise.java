package Exercise;

import ui.IO;

import java.util.ArrayList;
import java.util.List;

public abstract class Exercise {

    protected final IO io;
    private String exerciseName;
    private String description;
    protected List<String> question = new ArrayList<>();

    public Exercise(IO io) {
        this.io = io;
    }

    public void displayDescription() {
        io.write(description);
    }
    public abstract void run();
}
