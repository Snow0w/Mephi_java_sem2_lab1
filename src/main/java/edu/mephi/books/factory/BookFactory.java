package edu.mephi.books.factory;

import edu.mephi.books.interfaces.Fiction;
import edu.mephi.books.interfaces.Textbook;

public interface BookFactory {
  Textbook createTextbook();
  Fiction createFiction();
}
