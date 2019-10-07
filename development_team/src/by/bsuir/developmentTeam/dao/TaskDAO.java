package by.bsuir.developmentTeam.dao;

import by.bsuir.developmentTeam.bean.Task;

import java.util.ArrayList;
import java.util.Scanner;

public interface TaskDAO {
  void addTask(ArrayList<Task> tasks, Scanner in);
  void deleteTask(ArrayList<Task> tasks, Scanner in);
  void output(ArrayList<Task> tasks);
  void outputTask(Task task);
  void searchByName(ArrayList<Task> tasks, Scanner in);
}
