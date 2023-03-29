package edu.mephi.books.factory;

import com.github.javafaker.Faker;
import edu.mephi.books.EnglishFiction;
import edu.mephi.books.EnglishTextbook;
import edu.mephi.books.interfaces.Fiction;
import edu.mephi.books.interfaces.Textbook;
import java.util.ArrayList;
import java.util.Arrays;

public class EnglishBookFactory implements BookFactory {
  private int textIter;
  private ArrayList<String> names;
  private ArrayList<String> lastNames;
  private ArrayList<String> authors;
  private ArrayList<String> university;
  private ArrayList<String> levels;
  private Faker faker;

  public EnglishBookFactory() {
    this.textIter = 0;
    this.names = new ArrayList<String>(Arrays.asList(
        "Becoming a Sports Agent", "Sports and Society",
        "Foundations of Sports Analytics: Data, Representation, and Models in Sports",
        "Sports Marketing", "Sports Performance Analytics"));
    this.university = new ArrayList<String>(
        Arrays.asList("Case Western Reserve University", "Duke University",
                      "University of Michigan", "Northwestern University",
                      "University of Michigan"));
    this.authors = new ArrayList<String>(
        Arrays.asList("Peter A. Carfagna", "Orin Starn", "Wenche Wang",
                      "Candy Lee", "Wenche Wang"));
    this.lastNames = new ArrayList<String>(
        Arrays.asList("(beginner)", "(intermediate)", "(advanced)"));
    this.levels =
        new ArrayList<String>(Arrays.asList("bachelor", "magistracy"));
    faker = new Faker();
  }
  @Override
  public Textbook createTextbook() {
    if (textIter / 3 == names.size())
      return null;
    String name = new String("\"");
    name = name.concat(names.get(textIter / 3)).concat(" ");
    name = name.concat(lastNames.get(textIter % 3)).concat("\"");
    String level =
        new String(textIter % 3 == 2 ? levels.get(1) : levels.get(0));
    textIter++;
    return new EnglishTextbook(name, university.get((textIter - 1) / 3),
                               authors.get((textIter - 1) / 3), level);
  }

  @Override
  public Fiction createFiction() {
    return new EnglishFiction(faker.book().title());
  }
}
