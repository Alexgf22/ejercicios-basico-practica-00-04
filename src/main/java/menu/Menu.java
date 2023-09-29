package menu;

import Exercise.*;
import ui.IO;
import java.util.List;

public abstract class Menu {
    private final List<Group> allGroups;
    private final IO io;

    public Menu(List<Group> groupList, IO io) {
        this.allGroups = groupList;
        this.io = io;
    }

    public void menuListGroups() {
        StringBuilder groupsString = new StringBuilder();
        int i = 0;
        for (Group group : allGroups) {
            groupsString.append(String.format("%d - %s\n", i, group.getName()));
            groupsString.append(group.getDescription());
            groupsString.append("\n");
            i = i + 1;
        }
        io.write(groupsString.toString());
    }

    public void menuListExercises(int group) {
        StringBuilder exerciseString = new StringBuilder();
        int i = 0;
        for (Exercise exercise : allGroups.get(group).getExercises()) {
            exerciseString.append(String.format("%d - %s\n", i, exercise.getName()));
            exerciseString.append(exercise.getDescription());
            exerciseString.append("\n");
            i = i + 1;
        }
        io.write(exerciseString.toString());
    }
    
    public Exercise selectExercise(int group, int exercise) {
        return allGroups.get(group).getExercises().get(exercise);
    }

    public void startMenu() {
        io.write("""
                ██████╗░░█████╗░░██████╗██╗░█████╗░  
                ██╔══██╗██╔══██╗██╔════╝██║██╔══██╗  
                ██████╦╝███████║╚█████╗░██║██║░░╚═╝  
                ██╔══██╗██╔══██║░╚═══██╗██║██║░░██╗  
                ██████╦╝██║░░██║██████╔╝██║╚█████╔╝  
                ╚═════╝░╚═╝░░╚═╝╚═════╝░╚═╝░╚════╝░  

                ░░░░░██╗░█████╗░██╗░░░██╗░█████╗░
                ░░░░░██║██╔══██╗██║░░░██║██╔══██╗
                ░░░░░██║███████║╚██╗░██╔╝███████║
                ██╗░░██║██╔══██║░╚████╔╝░██╔══██║
                ╚█████╔╝██║░░██║░░╚██╔╝░░██║░░██║
                ░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝

                ███████╗██╗░░██╗███████╗██████╗░░█████╗░██╗░██████╗███████╗░██████╗
                ██╔════╝╚██╗██╔╝██╔════╝██╔══██╗██╔══██╗██║██╔════╝██╔════╝██╔════╝
                █████╗░░░╚███╔╝░█████╗░░██████╔╝██║░░╚═╝██║╚█████╗░█████╗░░╚█████╗░
                ██╔══╝░░░██╔██╗░██╔══╝░░██╔══██╗██║░░██╗██║░╚═══██╗██╔══╝░░░╚═══██╗
                ███████╗██╔╝╚██╗███████╗██║░░██║╚█████╔╝██║██████╔╝███████╗██████╔╝
                ╚══════╝╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝░╚════╝░╚═╝╚═════╝░╚══════╝╚═════╝░
                    
                Start?
                y/n...
                """);
    }

    public void exitMenu() {
        io.write("""
███████╗███╗░░██╗██████╗░
██╔════╝████╗░██║██╔══██╗
█████╗░░██╔██╗██║██║░░██║
██╔══╝░░██║╚████║██║░░██║
███████╗██║░╚███║██████╔╝
╚══════╝╚═╝░░╚══╝╚═════╝░
    """);
    }
}
