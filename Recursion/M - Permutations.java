package Recursion;

//Backtracking Soln
import java.util.*;

class Program {
  public static List<List<Integer>> getPermutations(List<Integer> array) {
    if(array.size() == 0) return new ArrayList<List<Integer>>();
    List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), array);
        return list;
  }
  private static void backtrack(List<List<Integer>> list, List<Integer> tempList, List<Integer> nums){
        if(tempList.size() == nums.size()){
           list.add(new ArrayList<>(tempList));
        } else{
           for(int i = 0; i < nums.size(); i++){ 
              if(tempList.contains(nums.get(i))) continue; // element already exists, skip
              tempList.add(nums.get(i));
              backtrack(list, tempList, nums);
              tempList.remove(tempList.size() - 1);
           }
        }
     } 
}

