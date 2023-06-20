import java.util.*;

// Do not edit the class below except for
// the constructor and the createSet, find,
// and union methods. Feel free to add new
// properties and methods to the class.
class Program {
  static class UnionFind {
    private Map<Integer, Integer> parents;

    public UnionFind() {
      parents = new HashMap<Integer,Integer>();
    }

    public void createSet(int value) {
      /*
      // create `n` disjoint sets (one for each item)
        for (int i: universe) {
            parent.put(i, i);
        }
      */
      if(parents.containsKey(value)) return;
      parents.put(value,value);
    }

    public Integer find(int value) { 
      if(!parents.containsKey(value)) return null; // if `value` is null
      if(parents.get(value) == value) return value; // if `value` is root
      return find(parents.get(value)); // recur for the parent until we find the root
    }

    public void union(int valueOne, int valueTwo) {
      // find the root of the sets in which elements `x` and `y` belongs
      Integer set1 = find(valueOne);
      Integer set2 = find(valueTwo);
      if(set1 == null || set2 == null || set2.equals(set1)) return;
      parents.put(set2, set1);
    }
  }
}
