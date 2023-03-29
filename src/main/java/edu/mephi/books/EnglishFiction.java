package edu.mephi.books;

import edu.mephi.books.interfaces.Fiction;

public class EnglishFiction implements Fiction {
  private String name;

  public EnglishFiction(String name) { this.name = name; }

  @Override
  public String getInfo() {
    return new String(name);
  }
}
