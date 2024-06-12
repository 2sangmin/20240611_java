package p02_variable;

import common.Utils;
import p01_class.Animal;

public class Ex05Char {
  char chr ;
  public static void main(String[] args) {
    char c1 = 'A';
    Utils.typeOf(c1);
    System.out.println((int)c1);
    System.out.println(c1 + c1);
    Utils.typeOf(c1+c1);
    char c2 = 'a';
    Utils.typeOf(new Animal());
    char c3 = '0';
    System.out.println((int)c2);
    System.out.println((int)c3);
    // char c4 = ''; 에러

    System.out.println("==========================================");

    Ex05Char ex05char = new Ex05Char();
    System.out.println(ex05char.chr);
    // 공백의 hexa 코드값은 '\u0000', ' '
    System.out.println((int)ex05char.chr);
    Utils.typeOf(ex05char.chr);
    if (ex05char.chr == '\u0000') {
      System.out.println("공백이 같습니다");
    }
    // 특수 문자 리터럴
    char c4 = '\'';
    char c5 = '\"';
    char c6 = '\\';
    char c7 = '\b'; // 백스페이스
    char c8 = '\t'; // tab
    char c9 = '\n'; // 개행
    char c10 = '\r'; // 캐리지 리턴
    char c11 = '\f'; // 폼피드
  }






}
