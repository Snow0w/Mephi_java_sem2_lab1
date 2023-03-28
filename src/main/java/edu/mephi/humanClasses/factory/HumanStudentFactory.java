package edu.mephi.humanClasses.factory;

import edu.mephi.humanClasses.Human;
import edu.mephi.humanClasses.HumanStudent;
import java.util.ArrayList;

public class HumanStudentFactory extends HumanFactory {

  public HumanStudentFactory(ArrayList<String> maleName,
                             ArrayList<String> femaleName,
                             ArrayList<String> maleLastName,
                             ArrayList<String> femaleLastName,
                             ArrayList<String> femaleFathersName,
                             ArrayList<String> maleFathersName) {
    super(maleName, femaleName, maleLastName, femaleLastName, femaleFathersName,
          maleFathersName);
  }

  @Override
  public Human createHuman() {
    HumanStudent human = new HumanStudent();
    if (initHuman(human))
      return human;
    return null;
  }
}
