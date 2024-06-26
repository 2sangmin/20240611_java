package p02_variable;

import common.Utils;

public class Ex06int {
  public static void main(String[] args) {
    byte b1 = 100;
//    byte b2 = 200; // 에러 ( 표현가능범위 벗어남)
    byte b3 = 100;
    Utils.typeOf(b1 + b3);
//    byte b4 = b1+b3;
    byte b4 = (byte) (b1+b3);
    System.out.println(b1+b3);
    Utils.typeOf(b4);
    System.out.println(b4);
    // boolean 제외한 4byte 이하 자료형은 int로 변환후 연산
    short s1 = 1000;
    short s2 = 1000;
    short s3 = (short) (s1 + s2);//명시적 형변환
    System.out.println(s3);
    int i1 = s1 + s2;
    System.out.println("========");
    System.out.println(i1);
    Utils.typeOf(i1);
    long l1 = 200L; // long = long
    long l2 = 200; // long = int, long l2=(long)200;묵시적형변환

    int i2 = (int) l2; //큰범위가 작은 범위로 올때는 명시적 선언!
    System.out.println("========");
    long result = i2 + l1;
    Utils.typeOf(result); //long 자료형과 연산을 할 경우 long 타입으로 형변환

    int i3 = b1; //  int = byte :: 묵시적 형변환(int 표현범위큼)
    byte b5 = (byte) i3; // byte = int :: 명시적 형변환
  }
}
