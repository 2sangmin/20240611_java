package p05_inherit;

import common.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex10Modifier {
  // 접근 제어자(Access Modifier) : public, protected, default, private
  public String publicVar;; // 제약없이 사용가능
  protected String protectedVar; // common 패키지에서 사용예) 클래스를 상속받았을때만 다른 패키지 사용가능
  String defaultVar; // 앞에 아무것도 적지 않았을때 default 적용 package 안에서만 사용가능
  private String privateVar; // 클래스 안에서만 사용할때
  // 메서드 앞에도 접근 제어자 4가지 다 붙음.

  public static void main(String[] args) {
    // private int num = 1; // 지역변수는 접근 제어자 사용불가
    // 지역변수를 익명객체에서 쓸때 final붙임, java8부터 안 붙여도 됨.
    final int result = 10;
    new JButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println(result); // 상수라서 사용은 가능
//         result = 10; // 지역변수는 익명객체에서 변경불가
      }
    });
    FinalClass finalClass = new FinalClass();
    System.out.println(finalClass);
    // java10 부터 var 사용가능. 선언과 초기화 분리적용 안됨.
    var name = "LGH"; // 동적할당가능, 단 지역변수일떄!
    Utils.typeOf(name);
  }
}
// final이 class 앞에 붙을 때 제어자는 상속이 안됨
final class FinalClass {}
// class FinalParents extends FinalClass {}

