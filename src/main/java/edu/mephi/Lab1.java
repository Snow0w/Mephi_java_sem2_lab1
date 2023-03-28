package edu.mephi;

import edu.mephi.excel.Excel;
import java.util.ArrayList;

public class Lab1 {
  private static void printList(ArrayList<String> list) {
    for (String l : list) {
      System.out.println(l);
    }
  }

  public static void main(String[] args) {
    Excel test = new Excel("/home/snow0w/repos/JAVA/lab1/files/test.xlsx");
    ArrayList<String> male = test.getMaleNameList();
    ArrayList<String> female = test.getFemaleNameList();

    printList(male);
    System.out.println();
    printList(female);
    System.out.println();
    printList(test.getMaleFathersName());
    System.out.println();
    printList(test.getFemaleFathersName());
    System.out.println();
    printList(test.getMaleStudentLastNameList());
    System.out.println();
    printList(test.getFemaleStudentLastNameList());
    System.out.println();
    printList(test.getMaleProfLastNameList());
    System.out.println();
    printList(test.getFemaleProfLastNameList());
    System.out.println();
  }
}
