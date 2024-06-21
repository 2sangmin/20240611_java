package p03_method;

import javax.swing.*;

public class Ex08SwitchCaseEx {
  public static void main(String[] args) {
    String input;
    boolean inf = true;
    do {
      input = JOptionPane.showInputDialog("당신의 이름을 입력하시오.");
      String familyName = input.substring(0, 1);
      switch (familyName) {
        case "김":
          System.out.println("Kim");
          inf = false;
          break;
        case "이":
          System.out.println("Lee");
          inf = false;
          break;
        case "박":
          System.out.println("Park");
          inf = false;
          break;
        case "성":
          System.out.println("Seong");
          inf = false;
          break;
        case "최":
          System.out.println("Choi");
          inf = false;
          break;
        case "정":
          System.out.println("Jung");
          inf = false;
          break;
        case "강":
          System.out.println("Kang");
          inf = false;
          break;
      }
    } while (inf == true);
  }
}
