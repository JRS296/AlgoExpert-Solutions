package Recursion;

import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    return prodSum(array, 1);
  }

  public static int prodSum(List<Object> array, int depth) {
    int sum = 0;
    for(Object obj : array) {
      sum += obj instanceof ArrayList ? prodSum((ArrayList<Object>)obj, depth+1) : (int)obj;
    }
    return sum * depth;
  }
}

