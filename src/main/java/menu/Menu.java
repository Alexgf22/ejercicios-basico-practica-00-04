package menu;

import exercise.*;
import group.Group;
import ui.IO;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private ArrayList<Group> allGroups = new ArrayList();
    private final IO io;

    public Menu(ArrayList<Group> groupList, IO io) {
        this.allGroups = groupList;
        this.io = io;
    }

    public void menuListGroups() {
        int i = 0;
        for (Group group : allGroups) {
            io.write(String.format("%d - %s\n", i, group.getName()));
            io.write(group.getDescription());
            io.write("\n");
            i = i + 1;
        }
    }

    public void menuListExercises(int group) {
        int i = 0;
        for (Exercise exercise : allGroups.get(group).getExercises()) {
            io.write(String.format("%d - %s\n", i, exercise.getExerciseName()));
            io.write(exercise.getDescription());
            io.write("\n");
            i = i + 1;
        }
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
