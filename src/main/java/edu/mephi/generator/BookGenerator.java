package edu.mephi.generator;

import edu.mephi.books.factory.EnglishBookFactory;
import edu.mephi.books.factory.RussianBookFactory;
import edu.mephi.books.interfaces.Bookable;
import java.util.ArrayList;

public class BookGenerator {
  private static int num = 50;
  private EnglishBookFactory en;
  private RussianBookFactory ru;

  public BookGenerator() {
    this.en = new EnglishBookFactory();
    this.ru = new RussianBookFactory();
  }
  public ArrayList<Bookable> generateBookList() {
    ArrayList<Bookable> list = new ArrayList<Bookable>();
    Bookable book;

    book = en.createTextbook();
    while (book != null) {
      list.add(book);
      book = en.createTextbook();
    }
    book = ru.createTextbook();
    while (book != null) {
      list.add(book);
      book = ru.createTextbook();
    }
    for (int i = 0; i < num; i++) {
      if (i % 2 == 0) {
        list.add(en.createFiction());
      } else {
        list.add(ru.createFiction());
      }
    }
    return list;
  }
}
