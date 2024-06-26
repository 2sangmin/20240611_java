package p08_iO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04FileReader {
  public static void main(String[] args) {
    String fileName = "test.txt";
    try {
      FileInputStream fis = new FileInputStream(fileName);
      FileReader fr = new FileReader(fileName);

      int data = 0;

      while ((data = fis.read()) != -1) System.out.print((char) data);
      System.out.println();
      fis.close();

      while ((data = fr.read()) != -1) System.out.print((char) data);
      System.out.println();
      fr.close();

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}