package by.bsuir.developmentTeam.task;

import by.bsuir.developmentTeam.developer.Developer;
import by.bsuir.developmentTeam.xmlserializer.XMLSerializer;

import java.util.ArrayList;
import java.util.Scanner;

public class AddTasks {
  public static ArrayList<Task> addTask(ArrayList<Task> tasks) {
    Task task = new Task();

    task.setId(tasks.size());

    Scanner in = new Scanner(System.in);
    System.out.print("Input name: ");
    task.setName(in.next());
    System.out.print("Input description: ");
    task.setDescription(in.next());
    in.close();

    tasks.add(task);
    return tasks;
  }
}
