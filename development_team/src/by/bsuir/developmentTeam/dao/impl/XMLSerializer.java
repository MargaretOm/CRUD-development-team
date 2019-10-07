package by.bsuir.developmentTeam.dao.impl;

import by.bsuir.developmentTeam.bean.*;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;
import java.util.ArrayList;

public class XMLSerializer {
  public static void writeDevelopers(ArrayList<Developer> array) throws FileNotFoundException {
    XMLEncoder encoder =
            new XMLEncoder(
                    new BufferedOutputStream(
                            new FileOutputStream(".//by//bsuir//developmentTeam//dao//impl//developers.out")));
    encoder.writeObject(array);
    encoder.close(); //finaly or try with params
  }

  public static ArrayList<Developer> readDevelopers() throws Exception {
    XMLDecoder decoder =
            new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(".//by//bsuir//developmentTeam//dao//impl//developers.out")));
    ArrayList<Developer> array = (ArrayList<Developer>)decoder.readObject();
    decoder.close();
    return array;
  }

  public static void writeTasks(ArrayList<Task> array) throws Exception{
    XMLEncoder encoder =
            new XMLEncoder(
                    new BufferedOutputStream(
                            new FileOutputStream(".//by//bsuir//developmentTeam//dao//impl//tasks.out")));
    encoder.writeObject(array);
    encoder.close();
  }

  public static ArrayList<Task> readTasks() throws Exception {
    XMLDecoder decoder =
            new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(".//by//bsuir//developmentTeam//dao//impl//tasks.out")));
    ArrayList<Task> array = (ArrayList<Task>)decoder.readObject();
    decoder.close();
    return array;
  }
}

