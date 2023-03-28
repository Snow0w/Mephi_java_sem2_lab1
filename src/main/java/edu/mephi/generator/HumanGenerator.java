package edu.mephi.generator;

import edu.mephi.excel.Excel;
import edu.mephi.humanClasses.Human;
import edu.mephi.humanClasses.factory.HumanProfFactory;
import edu.mephi.humanClasses.factory.HumanStudentFactory;
import java.util.ArrayList;

public class HumanGenerator {
  HumanProfFactory profFactory;
  HumanStudentFactory studentFactory;

  public HumanGenerator(Excel excel) {
    this.profFactory = new HumanProfFactory(
        excel.getMaleNameList(), excel.getFemaleNameList(),
        excel.getMaleProfLastNameList(), excel.getFemaleProfLastNameList(),
        excel.getMaleFathersName(), excel.getFemaleFathersName());
    this.studentFactory = new HumanStudentFactory(
        excel.getMaleNameList(), excel.getFemaleNameList(),
        excel.getMaleStudentLastNameList(),
        excel.getFemaleStudentLastNameList(), excel.getMaleFathersName(),
        excel.getFemaleFathersName());
  }

  public ArrayList<Human> generateHumanList() {
    ArrayList<Human> list = new ArrayList<Human>();
    Human human;

    human = this.profFactory.createHuman();
    while (human != null) {
      list.add(human);
      human = this.profFactory.createHuman();
    }
    human = this.studentFactory.createHuman();
    while (human != null) {
      list.add(human);
      human = this.studentFactory.createHuman();
    }
    return list;
  }
}
