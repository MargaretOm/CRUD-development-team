package by.bsuir.developmentTeam.dao.factory;

import by.bsuir.developmentTeam.bean.*;
import by.bsuir.developmentTeam.dao.impl.XMLSerializer;

import java.util.ArrayList;


public class DAOFactory {
  //private static final DAOFactory instance = new DAOFactory();
  private static ArrayList<Task> tasks = new ArrayList<>();
  private static ArrayList<Developer> developers = new ArrayList<>();

//  private DAOFactory(){}
//  public static DAOFactory getInstance(){
//    return instance;
//  }
  public static ArrayList<Task> getTasksDAO() throws Exception {
    tasks = XMLSerializer.readTasks();
    return tasks;
  }
  public static ArrayList<Developer> getDevelopersDAO() throws Exception {
    developers = XMLSerializer.readDevelopers();
    return developers;
  }
}
