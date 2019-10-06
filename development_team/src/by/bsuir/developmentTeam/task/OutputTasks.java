package by.bsuir.developmentTeam.task;

import by.bsuir.developmentTeam.xmlserializer.XMLSerializer;

import java.util.ArrayList;

public class OutputTasks {
  public static void output(ArrayList<Task> tasks) {
    for (int i = 0; i<tasks.size(); i++) {
      outputTask(tasks.get(i));
    }
  }

  private static void outputTask(Task task) {
      System.out.println(task.getId());
      System.out.println(task.getName());
      System.out.println(task.getDescription());
      System.out.println(task.getDeveloper().getLastName());
  }
}
