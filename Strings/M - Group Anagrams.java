package Strings;
import java.util.*;

class Program {
  public static List<List<String>> groupAnagrams(List<String> words) {
    HashMap<String, ArrayList<String>> hmap = new HashMap<String, ArrayList<String>>();
    for(String x : words) {
      int arr[] = new int[26];
      for(int i=0; i<x.length(); i++) {
        arr[x.charAt(i)-'a']++;
      }
      String key = Arrays.toString(arr);
      if(!hmap.containsKey(key)) {
        hmap.put(key, new ArrayList<String>());
        ArrayList<String> temp = hmap.get(key);
        temp.add(x);
        hmap.put(key, temp);
      } else {
        ArrayList<String> temp = hmap.get(key);
        temp.add(x);
        hmap.put(key, temp);
      }
    }
    //System.out.println(hmap.values());
    List<List<String>> list = new ArrayList<List<String>>(hmap.values());
    return list;
  }
}

