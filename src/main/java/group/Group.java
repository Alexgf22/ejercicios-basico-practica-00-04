package group;

import exercise.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private ArrayList<Exercise> exerciseList = new ArrayList<>();
    private String name;
    private String description;

    public void add(Exercise exercise) {
        exerciseList.add(exercise);
    }
    public Object getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public List<Exercise> getExercises() {
        return this.exerciseList;
    }


}
