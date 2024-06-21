package p04_Array;

import common.Utils;

public class Ex01Array {
  public static void main(String[] args) {
    //int[] arr = new int[10];

    // 선언과 초기화 분리
      // int[] arr;
      // arr = new int[10];

    // 선언과 초기화와 직접 값 입력
      //    int[] arr = new int[] {0,1,2,3};

    // 배열의 선언
    int[] arr = {0,1,2,3};

    Object[] objects = new Object[5];
    String[] strings = new String[3];
    Utils.typeOf(arr);
    Utils.typeOf(objects);
    Utils.typeOf(strings);
    System.out.println(arr.length);
    System.out.println(arr[0]); // int(기본형)의 초기값이 출력된다
    // System.out.println(objects[5]); //index의 범위가 벗어남
    System.out.println(objects[4]); //objects(참조형)의 초기값은 null
    System.out.println(strings[2]); //Strings(참조형)의 기본값은 null
//    arr[0] = 1;
//    arr[1] = 2;
    System.out.println(arr[1]);
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
      sum += arr[i];
    }
    System.out.println(sum);
  }
}
