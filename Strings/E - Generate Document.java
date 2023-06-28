package Strings;

import java.util.*;

class Program {

  public boolean generateDocument(String characters, String document) {
    HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();

    for(char ch: characters.toCharArray()) {
      h1.put(ch, h1.getOrDefault(ch,0)+1);
    }
    for(char ch: document.toCharArray()) {
      h2.put(ch, h2.getOrDefault(ch,0)+1);
    }
    for(Map.Entry<Character, Integer> temp: h2.entrySet()) {
      if(!h1.containsKey(temp.getKey())) return false;
      else if (h1.get(temp.getKey())<temp.getValue()) return false;
    }
    return true;
  }
}
