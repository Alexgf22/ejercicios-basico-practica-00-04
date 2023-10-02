package group;

import exercise.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private ArrayList<Exercise> exerciseList = new ArrayList<>();
    protected String name;
    protected String description;

    public void add(Exercise... exercises) {
        exerciseList.addAll(Arrays.asList(exercises));
    }

    public Object getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Exercise> getExercises() {
        return this.exerciseList;
    }


}
