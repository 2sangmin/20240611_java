package p03_method;

public class Ex02GetterSetter {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("이상민");
    System.out.println(p1.getName());
    p1.setId("totw37");
    System.out.println(p1.getId());
    p1.setPass("1234");
    System.out.println(p1.getPass());
    p1.setMobile("01012341234");
    System.out.println(p1.getMobile());
  }
}

class Person {
  // 속성에 private을 붙이면 외부에서 접근 불가
  private String name;
  private String id;
  private String pass;
  private String mobile;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public String getPass() {
    return pass;
  }
  public void setPass(String pass) {
    this.pass = pass;
  }

  public String getMobile() {
    return mobile;
  }
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
}

