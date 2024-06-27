package common;

import javax.swing.*;

public class Rock_Scissor_Paper {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "= 가위바위보 게임 =",
        "", JOptionPane.PLAIN_MESSAGE);

    boolean pass = true;
    do {
      int com = (int) (Math.random() * 3);
      int me = Integer.parseInt(JOptionPane.showInputDialog("[ 0.바위 , 1.가위 , 2.보 ] 중 하나의 숫자를 입력하세요. "));
      if ((me == 0 && com == 1) || (me == 1 && com == 2) || (me == 2 && com == 0)) {
        JOptionPane.showMessageDialog(null, "승리!",
            "", JOptionPane.INFORMATION_MESSAGE);
        pass = false;
      } else if (me == com) {
        JOptionPane.showMessageDialog(null, "비김!",
            "", JOptionPane.WARNING_MESSAGE);
      } else if ((me == 1 && com == 0) || (me == 2 && com == 1) || (me == 0 && com == 2)) {
        JOptionPane.showMessageDialog(null, "패배!",
            "", JOptionPane.ERROR_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(null, "1,2,3 중 하나를 입력하시오",
            "", JOptionPane.PLAIN_MESSAGE);
      }
      if (com == 0) {
        System.out.println("컴퓨터 : 바위");
      } else if (com == 1) {
        System.out.println("컴퓨터 : 가위");
      } else if (com == 2) {
        System.out.println("컴퓨터 : 보");
      }
      if (me == 0) {
        System.out.println("나 : 바위");
      } else if (me == 1) {
        System.out.println("나 : 가위");
      } else if (me == 2) {
        System.out.println("나 : 보");
      }
      if (me == com) {
        System.out.println("승부결과 : 무승부");
      } else if ((me == 0 && com == 1) || (me == 1 && com == 2) || (me == 2 && com == 0)) {
        System.out.println("승부결과 : 승리");
      } else if ((me == 1 && com == 0) || (me == 2 && com == 1) || (me == 0 && com == 2)) {
        System.out.println("승부결과 : 패배");
      }
    } while (pass == true);
  }
}
