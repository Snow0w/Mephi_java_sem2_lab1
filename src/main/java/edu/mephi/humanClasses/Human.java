package edu.mephi.humanClasses;

public abstract class Human {
  private String name;
  private String lastName;
  private String fathersName;
  private boolean male;

  public Human(String name, String lastName, String fathersName, boolean male) {
    this.name = name;
    this.lastName = lastName;
    this.fathersName = fathersName;
    this.male = male;
  }

  public Human() {}

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String getLastName() { return lastName; }
  public void setLastName(String lastName) { this.lastName = lastName; }
  public String getFathersName() { return fathersName; }
  public void setFathersName(String fathersName) {
    this.fathersName = fathersName;
  }
  public boolean isMale() { return male; }
  public void setMale(boolean male) { this.male = male; }
  public String sayHello() {
    return new String(name + " " + lastName + " " + fathersName);
  }
}
