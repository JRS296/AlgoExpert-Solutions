package Arrays;

import java.util.*;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if (sequence.size() == 0)
            return true;
        int seqPtr = 0;
        for (int x : array) {
            if (!sequence.isEmpty()) {
                if (x == sequence.get(seqPtr))
                    sequence.remove(seqPtr);
            }
        }
        // System.out.println(sequence);
        return sequence.isEmpty() ? true : false;
    }
}
