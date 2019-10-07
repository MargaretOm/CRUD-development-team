package by.bsuir.developmentTeam.service.impl;

import by.bsuir.developmentTeam.bean.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskServiceImpl {
  public static void addTask(ArrayList<Task> tasks, Scanner in) {
    Task task = new Task();

    task.setId(tasks.size() + 1);

    System.out.print("Input name: ");
    task.setName(in.nextLine());
    System.out.print("Input description: ");
    task.setDescription(in.nextLine());

    tasks.add(task);
  }

  public static void deleteTask(ArrayList<Task> tasks, Scanner in){
    System.out.print("Input id task which you want delete: ");
    int idTask = Integer.parseInt(in.nextLine()); //exception
    tasks.remove(idTask - 1);
  }

  public static ArrayList<Task> searchByName(ArrayList<Task> tasks, Scanner in){
    System.out.print("Input last name developer for search: ");
    ArrayList<Task> searchTasks = new ArrayList<>();
    String nameTask = in.nextLine(); //exception
    for(int i = 0; i<tasks.size(); i++) {
      Task task = tasks.get(i);
      if (task.getName().equals(nameTask)) {
        searchTasks.add(task);
      }
    }
    return searchTasks;
  }
}
