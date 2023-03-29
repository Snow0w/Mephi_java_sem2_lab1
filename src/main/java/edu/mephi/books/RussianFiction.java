package edu.mephi.books;

import edu.mephi.books.interfaces.Fiction;

public class RussianFiction implements Fiction {
  private String name;

  public RussianFiction(String name) { this.name = name; }

  @Override
  public String getInfo() {
    return new String(name);
  }
}
