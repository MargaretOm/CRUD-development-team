package by.bsuir.developmentTeam.task;

import by.bsuir.developmentTeam.developer.Developer;

import java.io.Serializable;

public class Task implements Serializable {
  private String name;
  private String description;
  private int id;
  private Developer developer = new Developer();

  public Task (){
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Developer getDeveloper() {
    return developer;
  }

  public void setDeveloper(Developer developer) {
    this.developer = developer;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
