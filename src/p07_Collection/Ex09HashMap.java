package p07_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex09HashMap {
  private static Map phoneBook = new HashMap();

  public static void main(String[] args) {
    addPhone("친구", "김수영", "1110");
    addPhone("친구", "김수한", "1111");
    addPhone("친구", "김수둘", "1112");
    addPhone("친구", "김수셋", "1113");
    addPhone("마트", "1114");
    printBook(phoneBook);
  }

  private static void addPhone(String group, String name, String tel) {
    if (!phoneBook.containsKey(group)) {
      phoneBook.put(group, new HashMap<>());
    }
    HashMap book = (HashMap) phoneBook.get(group);
    book.put(name, tel);
  }

  private static void addPhone(String name, String tel) {
    addPhone("기타", name, tel);
  }

  private static void printBook(Map map) {
    Iterator it = phoneBook.keySet().iterator();
    while (it.hasNext()) {
      String group = (String) it.next();
      HashMap book = (HashMap) phoneBook.get(group);
      System.out.printf(" ※ %s : 총%d개 \n", group, book.size());

      Iterator subIt = book.entrySet().iterator();
      ;
      while (subIt.hasNext()) {
        Map.Entry entry = (Map.Entry) subIt.next();
        System.out.printf("  - %s %3s , 번호:%s \n" ,group,entry.getKey(),entry.getValue());
      }
      System.out.println();
    }
  }
}
