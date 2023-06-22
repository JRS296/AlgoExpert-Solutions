//Basically Jump Game - Greedy Appraoch works, no need for DP
class Program {
  public static int minNumberOfJumps(int[] nums) {
    int n = nums.length; // length of the nums array
        int jumps = 0; // number of jumps needed to reach the end
        int curEnd = 0; // farthest index that can be reached with the current number of jumps
        int curFarthest = 0; // farthest index that can be reached from the current index
        
        // iterate over the nums array from 0 to n - 1
        for (int i = 0; i < n - 1; i++) {
          //System.out.println(i + " " + jumps + " " + curFarthest + " " + curEnd);
            curFarthest = Math.max(curFarthest, i + nums[i]); // update curFarthest with the maximum distance that can be reached from this index
            
            // if i is equal to curEnd, we have reached the farthest possible index with the current number of jumps
            if (i == curEnd) {
                jumps++; // increment jumps by 1
                curEnd = curFarthest; // update curEnd with the new farthest index
            }
        }
        return jumps;
  }
}

/*
0 0 0 0
1 1 3 3
2 1 5 3
3 1 5 3
4 2 5 5
5 2 6 5
6 3 8 8
7 3 13 8
8 3 13 8
9 4 13 13

  "array": [3, 4, 2, 1, 2, 3, 7, 1, 1, 1, 3], OP = 4
*/
