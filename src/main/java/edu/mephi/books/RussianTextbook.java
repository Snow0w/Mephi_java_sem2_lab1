package edu.mephi.books;

import edu.mephi.books.interfaces.Textbook;

public class RussianTextbook implements Textbook {
  private String name;

  public RussianTextbook(String name) { this.name = name; }

  @Override
  public String getInfo() {
    return new String(name);
  }
}
