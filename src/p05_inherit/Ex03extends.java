package p05_inherit;

public class Ex03extends {
  public static void main(String[] args) {
    Marine m1 = new Marine();
    System.out.println(m1);
    Medic medic = new Medic();
    System.out.println(medic);
  }
}

// 추상클래스는 인스턴스 생성 불가. 상속받은 후 인스턴스 생성 가능
abstract class Unit {
  public Unit () {
    // this() 와 super()는 공존 불가 : 둘다 최상단에 있어야 하기 때문
    // super();
    // this("","",15);
    System.out.println("야생 동물 생성");
  }
  public Unit(String tribe, String name, int hp) {
    this.tribe = tribe;
    this.name = name;
    this.hp = hp;
  }
  String tribe;  String name;  int hp;

  public void move(int x, int y){}
  public void stop(){}

  @Override
  public String toString() {
    return String.format("%s{hp=%d, tribe=%s}",name, hp,tribe);
  }
}
abstract class Protoss extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Protoss(String name, int hp) {
    super("Protoss", name, hp);
  }
}
abstract class Terran extends Unit {
  // 상속할 경우에는 Member변수와 method만 상속
  public Terran(String name, int hp) {
    super("Terran",name, hp);
  }
}

class Marine extends Terran {
  public Marine() {
    super("Marine", 60);
  }
}
class Medic extends Terran {
  public Medic() {
    super("Medic", 45);
  }
}