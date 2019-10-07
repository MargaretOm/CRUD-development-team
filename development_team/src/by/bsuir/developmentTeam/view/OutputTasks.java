package by.bsuir.developmentTeam.view;

import by.bsuir.developmentTeam.bean.*;
import java.util.ArrayList;

public class OutputTasks {
  public static void output(ArrayList<Task> tasks) {
    for (int i = 0; i<tasks.size(); i++) {
      outputTask(tasks.get(i));
    }
  }

  public static void outputTask(Task task) {
    System.out.print(task.getId() + ". ");
    System.out.print("Name: " + task.getName() + ", ");
    System.out.print("Description: " + task.getDescription() + ", ");
    System.out.println("Developer: " + task.getDeveloper().getLastName() + ".");
  }
}

