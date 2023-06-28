package Strings;

import java.util.*;

class Program {
  public String[] commonCharacters(String[] strings) {
    int n = strings.length;
    int arr[][] = new int[26][n];
    int x = 0;
    for(String s: strings) {
      for(char ch: s.toCharArray()) {
        if(ch==' ') continue;
        arr[ch-'a'][x]++;
      }
      x++;
    }
    for(int y[] : arr) {
        System.out.println(Arrays.toString(y));
    }
    
    // for(int i=0; i<26; i++) {
    //   if(arr[i])
    // }
    // Write your code here.
    return new String[] {};
  }
}

