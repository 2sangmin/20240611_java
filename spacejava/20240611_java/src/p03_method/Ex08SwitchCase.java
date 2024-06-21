package p03_method;

import java.util.Scanner;

public class Ex08SwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    System.out.println("태어난달 입력: ");
    switch (input) {
      case 1,2,12 :
        System.out.println("태어난 달의 계절은 겨울 입니다.");
        break;
      case 3,4,5,6 :
        System.out.println("태어난 달의 계절은 봄 입니다.");
        break;
      case 7,8,9 :
        System.out.println("태어난 달의 계절은 여름 입니다.");
        break;
      case 10,11 :
        System.out.println("태어난 달의 계절은 가을 입니다.");
        break;
      default :
        System.out.println("1~12사이의 값을 넣으시오");
    }
  }
}
