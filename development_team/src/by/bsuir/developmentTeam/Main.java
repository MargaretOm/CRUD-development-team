package by.bsuir.developmentTeam;

import java.util.ArrayList;
import java.util.Scanner;

import by.bsuir.developmentTeam.bean.*;
import by.bsuir.developmentTeam.service.impl.*;
import by.bsuir.developmentTeam.menu.OutputMenu;
import by.bsuir.developmentTeam.view.OutputDevelopers;
import by.bsuir.developmentTeam.view.OutputTasks;
import by.bsuir.developmentTeam.dao.impl.XMLSerializer;
import by.bsuir.developmentTeam.dao.factory.DAOFactory;

public class Main {
  public static void main(String[] args) throws Exception {
    ArrayList<Task> tasks = DAOFactory.getTasksDAO();
    ArrayList<Developer> developers = DAOFactory.getDevelopersDAO();

    Scanner in = new Scanner(System.in);
    int number = 0;
    while (number != 13 && number != 14) {
      OutputMenu.output();
      System.out.print("Input number of menu: ");
      try {
        number = Integer.parseInt(in.nextLine());
        switch (number) {
          case 1:
            OutputDevelopers.output(developers);
            break;
          case 2:
            DeveloperServiceImpl.addDeveloper(developers, in);
            break;
          case 3:
            OutputDevelopers.output(developers);
            DeveloperServiceImpl.deleteDeveloper(developers, in);
            break;
          case 4:
            OutputDevelopers.output(developers);
            DeveloperServiceImpl.updateDeveloper(developers, in);
            break;
          case 5:
            OutputTasks.output(tasks);
            break;
          case 6:
            TaskServiceImpl.addTask(tasks, in);
            break;
          case 7:
            OutputTasks.output(tasks);
            TaskServiceImpl.deleteTask(tasks, in);
            break;
          case 8: //update task
            break;
          case 9:
            OutputTasks.output(tasks);
            OutputDevelopers.output(developers);
            DeveloperServiceImpl.linkWithTasks(developers, tasks, in);
            break;
          case 10: //delete link
            break;
          case 11:
            ArrayList<Developer> searchDevelopers = DeveloperServiceImpl.searchByLastName(developers, in);
            for(int i = 0; i<searchDevelopers.size(); i++) {
              OutputDevelopers.outputDeveloper(searchDevelopers.get(i));
            }
            break;
          case 12:
            ArrayList<Task> searchTasks = TaskServiceImpl.searchByName(tasks, in);
            for(int i = 0; i<searchTasks.size(); i++) {
              OutputTasks.outputTask(searchTasks.get(i));
            }
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
        if (number != 13 && number != 14){
          System.out.println("Enter something to continue working: ");
          in.nextLine();
        }
        else{
          System.out.println("Goodbye!");
        }
      }
      catch (Exception e) {
        System.out.println("Wrong number!" +  e);
//          e.printStackTrace();
        System.out.println("Enter something to continue working: ");
        in.nextLine();
      }
    }
  }
}


