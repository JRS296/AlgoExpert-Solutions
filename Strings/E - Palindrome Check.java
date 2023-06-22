package Strings;

class Program {
  public static boolean isPalindrome(String str) {
    for(int i=0; i<str.length(); i++) {
      if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
    }
    return true;
  }
}

