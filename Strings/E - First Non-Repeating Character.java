package Strings;

class Program {

  public int firstNonRepeatingCharacter(String string) {
    char arr[] = new char[26];
    for(char ch: string.toCharArray()) {
      arr[ch-'a']++;
    }
    for(int i=0; i<string.length(); i++) {
      if(arr[string.charAt(i)-'a']==1) return i;
    }
    return -1;
  }
}

