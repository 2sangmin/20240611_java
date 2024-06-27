package p03_method;

import java.util.Scanner;

public class Ex07if {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자 입력: ");
    int input = sc.nextInt();
    String result = "";
    String result2 = "";
    if (input > 90) {
      result = "A";
    } else if (input > 80) {
      result = "B";
    } else if (input > 70) {
      result = "C";
    } else if (input > 60) {
      result = "D";
    } else {
      result = "F";
    }

    if ( input == 100 ) {
      result2 = "+";
    } else if (input % 10 > 6) {
      result2 = "+";
    } else if (input % 10 > 3) {
      result2 = "";
    } else {
      result2 = "-";
    }
    System.out.println(result + result2 + "학점");
  }
}
