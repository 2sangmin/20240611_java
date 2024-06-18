package p03_method;

import javax.swing.*;

public class Ex08SwitchCaseEx {
  public static void main(String[] args) {
    String INPUT;
    INPUT = JOptionPane.showInputDialog("태어난달을 입력하세요.");
    String season = "";
    switch (INPUT) {
      case "1", "2", "12":
        season = "겨울";
        break;
      case "3", "4", "5", "6":
        season = "봄";
        break;
      case "7", "8", "9":
        season = "여름";
        break;
      case "10", "11":
        season = "가을";
        break;
    }
    System.out.println("태어난 달의 계절은 " + season + "입니다.");
  }
}

