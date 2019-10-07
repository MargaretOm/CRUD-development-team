package by.bsuir.developmentTeam.service;

import by.bsuir.developmentTeam.bean.Task;

import java.util.ArrayList;
import java.util.Scanner;

public interface TaskService {
  void addTask(ArrayList<Task> tasks, Scanner in);
  void deleteTask(ArrayList<Task> tasks, Scanner in);
  void searchByName(ArrayList<Task> tasks, Scanner in);
}
