package common;

public class ex {
  public static void main(String[] args) {
    String seat[][] = new String[10][15];
    String eng[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    for (int i = 0; i < seat.length; i++) {
      for (int j = 1; j < seat[i].length; j++) {
        if (j == 1) System.out.print("[ ");
        seat[i][j] = eng[i] + (j);
        System.out.print(seat[i][j] );
        if (j > 0 && j < 14) System.out.print(", ");
        if (j == 14) System.out.print(" ]");
      }
      System.out.println();
    }
  }
}
