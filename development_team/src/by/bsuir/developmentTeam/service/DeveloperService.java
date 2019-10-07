package by.bsuir.developmentTeam.service;

import by.bsuir.developmentTeam.bean.*;

import java.util.ArrayList;
import java.util.Scanner;

public interface DeveloperService {
  void addDeveloper(ArrayList<Developer> developers, Scanner in);
  void deleteDeveloper(ArrayList<Developer> developers, Scanner in);
  void linkWithTasks(ArrayList<Developer> developers, ArrayList<Task> tasks, Scanner in);
  void searchByLastName(ArrayList<Developer> developers, Scanner in);
}
