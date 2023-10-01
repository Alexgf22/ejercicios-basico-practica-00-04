package exercise;

import java.util.List;

public class Group {
    private List<Exercise> exerciseList;
    private String name;
    private String description;

    public Group(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
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
