package p06_javalang;

//- 문자열을 비교할때는 == 가 아닌 equals 를 사용할것

import java.util.Arrays;
import java.util.StringJoiner;

public class Ex01String {
  public static void main(String[] args) {
    String str1 = "hello";
    String str2 = new String("hello");
    String str3 = "hello";
    String str4 = String.valueOf("hello");
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str1 == str4);
    // 시스템적으로 만들어진 hashcode
    System.out.println(str1.hashCode());
    System.out.println(str2.hashCode());
    System.out.println(str3.hashCode());
    // instance가 만들어졌을때
    System.out.println(System.identityHashCode(str1));
    System.out.println(System.identityHashCode(str2));
    System.out.println(System.identityHashCode(str3));
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));
    System.out.println(str1.equals(str4));
    // constant poo에 str1의 변수가 가리키는 "hello"를 가져옴
    System.out.println("str1.intern()"+ str1.intern());
    for (int i = 0; i < str1.length(); i++) {
      if(i!=0) System.out.print(",");
      System.out.print(str1.charAt(i));
    }
    System.out.println();
    System.out.println(str1.compareTo("world"));
    System.out.println(str1.concat(" world"));
    System.out.println(str1.contains("hell"));
    System.out.println(str1.endsWith("lo"));
    System.out.println(str1.indexOf("ll"));
    System.out.println(str1.indexOf('l',3));
    System.out.println("last :"+str1.lastIndexOf("el"));
    System.out.println(str1.replace("l","p"));
    System.out.println("");
    String[] arr = "Passion is genesis of genius".split("");
    System.out.println(Arrays.toString(arr));
    String fileName = "C:Users\\it\\Downloads\\abc.index.html";
    System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
    System.out.println(fileName.substring(fileName.lastIndexOf("\\")+1));
    System.out.println("hello world".toUpperCase());
    System.out.println("hello world".toLowerCase());
    System.out.println("  hello  world  ".trim());
    System.out.println(String.valueOf(0b100));
    System.out.println(String.valueOf(0010));
    System.out.println(String.valueOf(0xa0));
    StringJoiner sj = new StringJoiner("","(",")");
    for (String s : arr) {
      sj.add(s);
    }
    System.out.println(sj.toString());
  }




}
