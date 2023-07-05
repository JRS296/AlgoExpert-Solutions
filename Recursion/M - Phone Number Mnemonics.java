package Recursion;

import java.util.*;

class Program {
  ArrayList<String> ans = new ArrayList<String>();
  String arr[] = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
  public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
    if (phoneNumber.length() == 0) return ans;
    StringBuilder sb = new StringBuilder();
    helper(0,phoneNumber.length(), phoneNumber, sb);
    return ans;
  }

  public void helper(int ptr, int n, String s, StringBuilder sb) {
    if(ptr==n) {
      ans.add(sb.toString());
      return;
    }
    String currString = arr[s.charAt(ptr) - '0'];
    for(int i=0; i<currString.length(); i++) {
      sb.append(currString.charAt(i));
      helper(ptr+1,n, s, sb);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}
