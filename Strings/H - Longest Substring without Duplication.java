package Strings;

import java.util.*;

class Program {
  //clementisacap
  public static String longestSubstringWithoutDuplication(String str) {
    if(str.length()<=1) return str;
    int ansi = 0;
    int ansj = 0;
    int ansLen = 0;
    
    HashSet<Character> hset = new HashSet<Character>();
    int i=0;
    int j=0;
    for(j=0; j<str.length(); j++) {
      if(!hset.add(str.charAt(j))) {
        if(j-i > ansLen) {
          ansLen = j-i;
          ansi = i;
          ansj = j;
        }
        while(!hset.add(str.charAt(j))) {
          hset.remove(str.charAt(i++));
        }

      }
      //System.out.println(hset);
    }
    if(j-i > ansLen) {
          ansLen = j-i;
          ansi = i;
          ansj = j;
        }
    //System.out.println();
    if (ansLen == 0) return str;
    return str.substring(ansi, ansj);
  }
}

