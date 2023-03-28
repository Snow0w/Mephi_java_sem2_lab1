package edu.mephi.humanClasses.factory;

import edu.mephi.humanClasses.Human;
import edu.mephi.humanClasses.HumanProf;
import java.util.ArrayList;

public class HumanProfFactory extends HumanFactory {

  public HumanProfFactory(ArrayList<String> maleName,
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
    HumanProf human = new HumanProf();
    if (initHuman(human))
      return human;
    return null;
  }
}
