package edu.mephi;

import edu.mephi.books.interfaces.Bookable;
import edu.mephi.excel.Excel;
import edu.mephi.generator.BookGenerator;
import edu.mephi.generator.HumanGenerator;
import edu.mephi.gui.Gui;
import edu.mephi.humanClasses.Human;
import java.util.ArrayList;

public class Lab1 {

  public static void main(String[] args) {
    Excel test = new Excel("/home/snow0w/repos/JAVA/lab1/files/test.xlsx");
    HumanGenerator gen = new HumanGenerator(test);
    ArrayList<Human> list = gen.generateHumanList();
    BookGenerator genBook = new BookGenerator();
    ArrayList<Bookable> listBook = genBook.generateBookList();
    Gui gui = new Gui("App", list, listBook);
    gui.setVisible(true);
  }
}
