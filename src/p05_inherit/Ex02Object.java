package p05_inherit;

public class Ex02Object {
  public static void main(String[] args) {
    Member member = new Member("min", "0101234");
    String str = new String("hello");
    System.out.println(member);
    System.out.println(str);
    System.out.println(member instanceof Object);
    System.out.println(member instanceof Member);
    //    System.out.println(member instanceof String);
  }
}
// 모든 클래스는 Object를 상속 받는다.
class Member extends Object {
  String name, mobile;

  public Member(String name, String mobile) {
    this.name = name;
    this.mobile = mobile;
  }


  @Override
  public String toString() {
    return String.format("name: %s, mobile: %s", name, mobile
    );
  }
}
class Phone {int key;}
class Computer {int key;}
//java는 다중상속을 허용하지 않는다. 왜? 명확하기 때문에
//class SmartPhone extends Phone, Computer {}
