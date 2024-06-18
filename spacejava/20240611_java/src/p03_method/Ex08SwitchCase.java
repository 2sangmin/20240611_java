package p03_method;

import java.util.Scanner;

public class Ex08SwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("태어난달 입력: ");
    int input = sc.nextInt();
    String season = "";
    switch (input) {
      case 1,2,12 :
        season = "겨울";
        break;
      case 3,4,5,6 :
        season = "봄";
        break;
      case 7,8,9 :
        season = "여름";
        break;
      case 10,11 :
        season = "가을";
        break;
    }
    System.out.println("태어난 달의 계절은 " + season + "입니다.");
  }
}
