package p04_Array;

import java.util.Arrays;

public class Ex02applicate {
  public static void main(String[] args) {
    int[] score = new int[10];
    for (int i = 0; i < 10; i++) {
      score[i] = (int) (Math.random() * 31 + 70);
//      System.out.println("score[" + i + "] = " + score[i]);
    }
    System.out.println("\n" + Arrays.toString(score));
    maxArr(score);
    minArr(score);
    sumArr(score);
    avgArr(score);
  }

  public static void maxArr(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) if (max < arr[i]) {max = arr[i];}
    System.out.println("score 배열내 최댓값은 " + max + " 입니다. ");
  }

  public static void minArr(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) if (min > arr[i]) {min = arr[i];}
    System.out.println("score 배열내 최솟값은 " + min + " 입니다. ");
  }

  public static int sumArr(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) sum += arr[i];
    System.out.println("score 배열내 값의 총합은 " + sum + " 입니다.");
    return sum;
  }

  public static double avgArr(int[] arr) {
//    float avg = 0;
//    for (int i = 0; i < arr.length; i++) avg += arr[i];
//    avg /= arr.length;
    double result = sumArr(arr) / (double) arr.length;
    System.out.println("score 배열내 값의 평균값은 " + result + " 입니다.");
    return result;
  }
}
