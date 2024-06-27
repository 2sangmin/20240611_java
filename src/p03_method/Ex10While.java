package p03_method;

import javax.swing.*;

public class Ex10While {
  public static void main(String[] args) {
//    int i = 1;
//    int j = 1;
//    int k = 0;
//    while (i < 9) {
//      i++;
//      while (j < 9) {
//        j++;
//          System.out.printf("%d X %d = %2d \n", i, j, i * j);
//      }
//      System.out.println();
//      j = 1;
//    }
    System.out.println("@@@@@ 내 마음의 숫자를 맞춰봐 @@@@@");
    boolean pass = true;
    int random = (int) (Math.random() * 100);
    System.out.println("정답 : " + random);
    do {
      int answer = Integer.parseInt(JOptionPane.showInputDialog("1~100 까지의 숫자를 입력하세요"));
      if (answer == random) {
        JOptionPane.showMessageDialog(null, "정답!",
            "", JOptionPane.INFORMATION_MESSAGE);
        pass = false;
      } else if (answer > random && answer < 101) {
        JOptionPane.showMessageDialog(null, "아래",
            "오답!", JOptionPane.ERROR_MESSAGE);
      } else if (answer < random && answer > -1) {
        JOptionPane.showMessageDialog(null, "위",
            "오답!", JOptionPane.ERROR_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(null, "범위를 자세히 보시오",
            "오답!", JOptionPane.ERROR_MESSAGE);
      }
    } while (pass == true);

  }
}
