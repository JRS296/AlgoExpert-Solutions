import java.util.*;

class Program {

    public int minimumWaitingTime(int[] queries) {
        // Write your code here
        Arrays.sort(queries);
        int total = 0;
        for (int i = 0; i < queries.length; i++) {
            int dur = queries[i];
            int left = queries.length - (i + 1);
            total += left * dur;
        }

        return total;
    }
}
