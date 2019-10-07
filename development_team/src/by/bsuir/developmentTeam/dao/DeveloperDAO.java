package by.bsuir.developmentTeam.dao;

import by.bsuir.developmentTeam.bean.Developer;
import by.bsuir.developmentTeam.bean.Task;

import java.util.ArrayList;
import java.util.Scanner;

public interface DeveloperDAO {
  void addDeveloper(ArrayList<Developer> developers, Scanner in);
  void deleteDeveloper(ArrayList<Developer> developers, Scanner in);
  void linkWithTasks(ArrayList<Developer> developers, ArrayList<Task> tasks, Scanner in);
  void searchByLastName(ArrayList<Developer> developers, Scanner in);
}
