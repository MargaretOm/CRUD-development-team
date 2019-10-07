package by.bsuir.developmentTeam.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class Developer implements Serializable {
  private String firstName;
  private String lastName;
  private String position;
  private int id;
  private int age;
  private ArrayList<Task> tasks = new ArrayList<>();

  public Developer (){
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public ArrayList<Task> getTasks() {
    return tasks;
  }

  public void setTasks(ArrayList<Task> tasks) {
    this.tasks = tasks;
  }
}

