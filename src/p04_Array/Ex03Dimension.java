package p04_Array;

public class Ex03Dimension {
  public static void main(String[] args) {
    int[][] arr = new int[3][3];
    arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for (int i = 0; i < arr2.length; i++) {
      System.out.printf("{%d,%d,%d}", arr2[i][arr2[i].length - 3], arr2[i][arr2[i].length - 2], arr2[i][arr2[i].length - 1]);
      System.out.println();
    }
  }
}

