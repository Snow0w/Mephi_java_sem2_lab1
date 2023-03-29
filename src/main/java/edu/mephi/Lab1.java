package edu.mephi;

import edu.mephi.books.RussianTextbook;
import edu.mephi.books.factory.EnglishBookFactory;
import edu.mephi.books.factory.RussianBookFactory;
import edu.mephi.books.interfaces.Bookable;
import edu.mephi.excel.Excel;
import edu.mephi.generator.HumanGenerator;
import edu.mephi.humanClasses.Human;
import java.util.ArrayList;

public class Lab1 {
  private static void printList(ArrayList<String> list) {
    for (String l : list) {
      System.out.println(l);
    }
  }

  public static void main(String[] args) {
    Excel test = new Excel("/home/snow0w/repos/JAVA/lab1/files/test.xlsx");
    HumanGenerator gen = new HumanGenerator(test);
    ArrayList<Human> list = gen.generateHumanList();
    for (Human l : list) {
      l.sayHello();
    }
    // RussianBookFactory factory = new RussianBookFactory();
    // Bookable out = factory.createTextbook();
    // while (out != null) {
    //   System.out.println(out.getInfo());
    //   out = factory.createTextbook();
    // }
    EnglishBookFactory factory = new EnglishBookFactory();
    Bookable out = factory.createTextbook();
    while (out != null) {
      System.out.println(out.getInfo());
      out = factory.createTextbook();
    }
  }
}
