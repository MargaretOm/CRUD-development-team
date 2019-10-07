package by.bsuir.developmentTeam.view;

import by.bsuir.developmentTeam.bean.*;
import java.util.ArrayList;

public class OutputDevelopers {
  public static void output(ArrayList<Developer> developers) {
    for (int i = 0; i<developers.size(); i++) {
      outputDeveloper(developers.get(i));
      outputDeveloperTasks(developers.get(i).getTasks());
    }
  }

  public static void outputDeveloper(Developer developer) {
    System.out.print(developer.getId() + ". ");
    System.out.print("First name : " + developer.getFirstName() + ", ");
    System.out.print("Last name : " + developer.getLastName() + ", ");
    System.out.print("Position name : " + developer.getPosition() + ", ");
    System.out.println("Age : " + developer.getAge() + ". ");
  }

  private static void outputDeveloperTasks(ArrayList<Task> tasks) {
    System.out.println("                        Tasks:");
    for (int i = 0; i<tasks.size(); i++) {
      System.out.print("                        " + tasks.get(i).getId() + ". ");
      System.out.print("Name: " + tasks.get(i).getName() + ", ");
      System.out.println("Description: " + tasks.get(i).getDescription() + ".");
      //System.out.print(tasks.get(i).getDeveloper().getLastName());
    }
    System.out.println("----------------------------------------------------------------------------");
  }

}

