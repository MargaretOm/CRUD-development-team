package by.bsuir.developmentTeam.service.impl;

import by.bsuir.developmentTeam.bean.Developer;
import by.bsuir.developmentTeam.bean.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class DeveloperServiceImpl {
  public static void addDeveloper(ArrayList<Developer> developers, Scanner in) {
    Developer developer = new Developer();

    developer.setId(developers.size() + 1);

    System.out.print("Input first name: ");
    developer.setFirstName(in.nextLine());
    System.out.print("Input last name: ");
    developer.setLastName(in.nextLine());
    System.out.print("Input position: ");
    developer.setPosition(in.nextLine());
    System.out.print("Input age: ");
    developer.setAge(Integer.parseInt(in.nextLine()));

    developers.add(developer);
  }

  public static void updateDeveloper(ArrayList<Developer> developers, Scanner in){
    System.out.print("Input id developer which you want add tasks: ");
    int idDeveloper = Integer.parseInt(in.nextLine()); //exception
    for(int i = 0; i<developers.size(); i++) {
      Developer searchDeveloper = developers.get(i);
      if (searchDeveloper.getId() == (idDeveloper)) {
        System.out.print("Input first name: ");
        searchDeveloper.setFirstName(in.nextLine());
        System.out.print("Input last name: ");
        searchDeveloper.setLastName(in.nextLine());
        System.out.print("Input position: ");
        searchDeveloper.setPosition(in.nextLine());
        System.out.print("Input age: ");
        searchDeveloper.setAge(Integer.parseInt(in.nextLine()));
      }
    }
  }

  public static void deleteDeveloper(ArrayList<Developer> developers, Scanner in){
    System.out.print("Input id developer which you want delete: ");
    int idDeveloper = Integer.parseInt(in.nextLine()); //exception
    developers.remove(idDeveloper - 1);
  }

  public static void linkWithTasks(ArrayList<Developer> developers, ArrayList<Task> tasks, Scanner in){
    System.out.print("Input id developer which you want add tasks: ");
    int idDeveloper = Integer.parseInt(in.nextLine()); //exception
    Developer developer = new Developer();
    for(int i = 0; i<developers.size(); i++) {
      Developer searchDeveloper = developers.get(i);
      if (searchDeveloper.getId() == (idDeveloper)) {
        developer = searchDeveloper;
      }
    }
    String answer = "yes";
    while (answer == "yes") {
      addTask(developer, tasks, in);
      System.out.print("Successfully add! ");
      System.out.print("Do you want add task this developer yet? (yes/no)"); //exception
      answer = in.nextLine();
    }
  }

  private static void addTask(Developer developer, ArrayList<Task> tasks, Scanner in) {
    System.out.print("Input id task: ");
    int idTask = Integer.parseInt(in.nextLine()); //exception
    Task task = tasks.get(idTask -1);
    ArrayList<Task> tasks_developer = developer.getTasks();
    tasks_developer.add(task);

    developer.setTasks(tasks_developer);

    task.setDeveloper(developer);
  }

  public static ArrayList<Developer> searchByLastName(ArrayList<Developer> developers, Scanner in){
    System.out.print("Input last name developer for search: ");
    String lastNameDeveloper = in.nextLine(); //exception
    ArrayList<Developer> searchDevelopers = new ArrayList<>();
    for(int i = 0; i<developers.size(); i++) {
      Developer developer = developers.get(i);
      if (developer.getLastName().equals(lastNameDeveloper)) {
        searchDevelopers.add(developer);
      }
    }
    return searchDevelopers;
  }
}
