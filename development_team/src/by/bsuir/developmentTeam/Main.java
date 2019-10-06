package by.bsuir.developmentTeam;

import java.util.ArrayList;
import java.util.Scanner;

import by.bsuir.developmentTeam.developer.AddDeveloper;
import by.bsuir.developmentTeam.developer.Developer;
import by.bsuir.developmentTeam.developer.OutputDevelopers;
import by.bsuir.developmentTeam.menu.OutputMenu;
import by.bsuir.developmentTeam.task.AddTasks;
import by.bsuir.developmentTeam.task.OutputTasks;
import by.bsuir.developmentTeam.task.Task;
import by.bsuir.developmentTeam.xmlserializer.XMLSerializer;

public class Main {
  public static void main(String[] args) {
    ArrayList<Task> tasks = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    try {
      tasks = XMLSerializer.readTasks();
      developers = XMLSerializer.readDevelopers();
    }
    catch(Exception e) {
      System.out.println(e.toString());
    }
    Scanner in = new Scanner(System.in);
    int number = 0;
    while (number != 13 || number != 14) {
        OutputMenu.output();
        System.out.print("Input number of menu: ");
        try {
          number = in.nextInt();
          switch (number) {
            case 1:
              OutputDevelopers.output(developers);
              break;
            case 2:
              developers = AddDeveloper.addDeveloper(developers);
              break;
            case 3: //delete
              break;
            case 4: //update
              break;
            case 5:
              OutputTasks.output(tasks);
              break;
            case 6:
              tasks = AddTasks.addTask(tasks);
              break;
            case 7: //delete task
              break;
            case 8: //update task
              break;
            case 9: //create link
              break;
            case 10: //delete link
              break;
            case 11: //search last name
              break;
            case 12: //search task by name
              break;
            case 13:
              XMLSerializer.writeDevelopers(developers);
              XMLSerializer.writeTasks(tasks);
              break;
            case 14: //exit
              break;
            default:
              break;
          }
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }

    //link2
//    ArrayList<Task> tasks_developer = developer.getTasks();
//    tasks_developer.add(task);
//    tasks_developer.add(task);
//    developer.setTasks(tasks_developer);
//
//    task.setIdDeveloper(developer.getId());
  }
}
