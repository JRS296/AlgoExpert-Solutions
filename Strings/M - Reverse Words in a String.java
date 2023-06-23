package Strings;
import java.util.*;

class Program {

  public String reverseWordsInString(String string) {
    if (string.length() == 0) return string;
    StringBuilder sb = new StringBuilder();
    List<String> words = new LinkedList<String>();
    int i=0, j=0; boolean first = true;
    for(j=0; j<string.length(); j++) {
      if(string.charAt(j)==' ')
      {
        if (first) {
          words.add(" "+string.substring(i,j));
          first = false;
        } else {
          words.add(string.substring(i,j));
        }
        i=j;
      }
    }
    if(string.charAt(i)==' ') i++;
    words.add(string.substring(i,j));

    for(int k=words.size()-1; k>=0; k--) {
      sb.append(words.get(k));
    }
    System.out.println(sb);
    return sb.toString();
  }
}

