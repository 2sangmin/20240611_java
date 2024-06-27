package p03_method;

import javax.swing.*;

public class Ex09For {
  public static void main(String[] args) {

    for (int i = 2; i < 8; i += 3) {
      for (int j = 1; j < 10; j++) {
        for (int k = 0; k < 3; k++) {
          System.out.printf("%d X %d = %2d \t",
              i + k, j, (i + k) * j);
        }
        System.out.println();
      }
      System.out.println();
    }

    for (int b = 1; b < 10; b++) {
      System.out.printf("%d X %d = %2d  %d X %d = %2d \n", 8, b, 8 * b, 9, b, 9 * b);
    }
    System.out.println();
    System.out.println("===========================================");

    int i = 0;
    for (; ; ) {
      System.out.println(i++);
      if(i >= 10)
        break; // 자신이 속한 반복문을 벗어남
    }
    for (int k = 10, j = 0; j < 10; j++, k--) {
    }
  }
}
//    String input;
//    int sum;
//    System.out.println("※구구단을 외자!※");
//    input = JOptionPane.showInternalInputDialog();
//      for (int i = 1;i < 10; i++) {
//        sum = i * input;
//      }
