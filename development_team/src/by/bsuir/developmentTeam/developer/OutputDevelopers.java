package by.bsuir.developmentTeam.developer;

import by.bsuir.developmentTeam.task.Task;
import by.bsuir.developmentTeam.xmlserializer.XMLSerializer;

import java.util.ArrayList;

public class OutputDevelopers {
  public static void output(ArrayList<Developer> developers) {
    for (int i = 0; i<developers.size(); i++) {
      outputDeveloper(developers.get(i));
      outputDeveloperTasks(developers.get(i).getTasks());
    }
  }

  private static void outputDeveloper(Developer developer) {
    System.out.println(developer.getId());
    System.out.println(developer.getFirstName());
    System.out.println(developer.getLastName());
    System.out.println(developer.getAge());
    System.out.println(developer.getPosition());
  }

  private static void outputDeveloperTasks(ArrayList<Task> tasks) {
    for (int i = 0; i<tasks.size(); i++) {
      System.out.println(tasks.get(i).getId());
      System.out.println(tasks.get(i).getName());
      System.out.println(tasks.get(i).getDescription());
      System.out.println(tasks.get(i).getDeveloper().getLastName());
    }
  }

}
