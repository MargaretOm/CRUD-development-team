package by.bsuir.developmentTeam.developer;

import by.bsuir.developmentTeam.xmlserializer.XMLSerializer;

import java.util.ArrayList;
import java.util.Scanner;

public class AddDeveloper {
  public static ArrayList<Developer> addDeveloper(ArrayList<Developer> developers) {
    Developer developer = new Developer();

    developer.setId(developers.size());

    Scanner in = new Scanner(System.in);
      System.out.print("Input first name: ");
      developer.setFirstName(in.next());
      System.out.print("Input last name: ");
      developer.setLastName(in.next());
      System.out.print("Input position: ");
      developer.setPosition(in.next());
      System.out.print("Input age: ");
      developer.setAge(in.nextInt());
    in.close();

    developers.add(developer);
    return developers;
  }
}
