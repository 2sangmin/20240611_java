package p07_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex08Map {
  public static void main(String[] args) {
    Map map = new HashMap();
    map.put("admin", "1");
    map.put("user", "1");
    if (map.containsKey("member") == false) map.put("member", "1");
    if (!map.containsKey("member2")) map.put("member2", "2");
    // 뒤에 들어온 member key 값의 value가 나중에 들어온 값으로 덮어 씌워진다
    map.put("member", "3");
    System.out.println(map);
    map.remove("admin");
    map.remove("user");
    map.remove("user");
    System.out.println("remove : "+map);

    // 1) key 와 value를 동시에 접근
    Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry entry = (Map.Entry) it.next();
      System.out.printf(String.format(
              "key: %s , value: %s", entry.getKey(), entry.getValue()
          )
      );
    }

    //2) key 로 접근
    System.out.println("\n===========================");
    it = map.keySet().iterator();
    while (it.hasNext()) {
      String value = (String) it.next();
      System.out.printf(value+" ");
    }
  }
}
