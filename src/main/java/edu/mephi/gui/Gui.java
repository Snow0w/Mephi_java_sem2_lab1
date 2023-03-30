package edu.mephi.gui;

import edu.mephi.books.interfaces.Bookable;
import edu.mephi.humanClasses.Human;
import edu.mephi.humanClasses.HumanProf;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Gui extends JFrame {
  private JTree tree;
  private DefaultMutableTreeNode rootTree;
  private DefaultMutableTreeNode students;
  private DefaultMutableTreeNode profs;
  private JScrollPane scroll;
  private Random rand;

  public Gui(String name, ArrayList<Human> people, ArrayList<Bookable> books) {
    super(name);
    rand = new Random();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setLayout(new BorderLayout());
    this.rootTree = new DefaultMutableTreeNode("Пользователи");
    this.tree = new JTree(rootTree);
    this.students = new DefaultMutableTreeNode("Студенты");
    this.profs = new DefaultMutableTreeNode("Преподаватели");
    this.scroll = new JScrollPane(tree);
    rootTree.add(profs);
    rootTree.add(students);
    initHumanNodes(people, books);
    this.add(scroll);
  }

  private void initHumanNodes(ArrayList<Human> people,
                              ArrayList<Bookable> books) {
    DefaultMutableTreeNode varNode;

    for (Human p : people) {
      varNode = new DefaultMutableTreeNode(p.sayHello());
      if (p instanceof HumanProf) {
        profs.add(varNode);
      } else {
        students.add(varNode);
      }
      initBookNodes(varNode, books);
    }
  }

  private void initBookNodes(DefaultMutableTreeNode parent,
                             ArrayList<Bookable> books) {
    ArrayList<Bookable> copy = new ArrayList<>(books);
    Collections.shuffle(copy);
    DefaultMutableTreeNode varNode;

    for (Bookable b : copy.subList(0, rand.nextInt(3, 10))) {
      varNode = new DefaultMutableTreeNode(b.getInfo());
      parent.add(varNode);
    }
  }
}
