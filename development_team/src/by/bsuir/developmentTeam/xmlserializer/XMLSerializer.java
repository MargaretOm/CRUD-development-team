package by.bsuir.developmentTeam.xmlserializer;
import by.bsuir.developmentTeam.developer.Developer;
import by.bsuir.developmentTeam.task.Task;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;
import java.util.ArrayList;

public class XMLSerializer {
  public static void writeDevelopers(ArrayList<Developer> array) throws Exception{
    XMLEncoder encoder =
      new XMLEncoder(
        new BufferedOutputStream(
          new FileOutputStream("developers.out")));
    encoder.writeObject(array);
    encoder.close();
  }

  public static ArrayList<Developer> readDevelopers() throws Exception {
    XMLDecoder decoder =
      new XMLDecoder(
        new BufferedInputStream(
          new FileInputStream("developers.out")));
    ArrayList<Developer> array = (ArrayList<Developer>)decoder.readObject();
    decoder.close();
    return array;
  }

  public static void writeTasks(ArrayList<Task> array) throws Exception{
    XMLEncoder encoder =
      new XMLEncoder(
        new BufferedOutputStream(
          new FileOutputStream("tasks.out")));
    encoder.writeObject(array);
    encoder.close();
  }

  public static ArrayList<Task> readTasks() throws Exception {
    XMLDecoder decoder =
      new XMLDecoder(
        new BufferedInputStream(
          new FileInputStream("tasks.out")));
    ArrayList<Task> array = (ArrayList<Task>)decoder.readObject();
    decoder.close();
    return array;
  }
}
