import java.util.*;

class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        HashSet<Integer> hset = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            int temp = targetSum - array[i];
            if (hset.contains(temp))
                return new int[] { temp, array[i] };
            else
                hset.add(array[i]);
        }
        return new int[0];
    }
}
