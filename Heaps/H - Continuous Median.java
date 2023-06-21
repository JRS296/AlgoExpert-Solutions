package Heaps;

import java.util.*;

// Do not edit the class below except for
// the insert method. Feel free to add new
// properties and methods to the class.
class Program {
  static class ContinuousMedianHandler {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();//heap is a minimal heap by default
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());//change to a maximum heap
    double median = 0;

    public void insert(int num) {
      maxHeap.offer(num);
	minHeap.offer(maxHeap.poll());
	if (maxHeap.size() < minHeap.size())
		maxHeap.offer(minHeap.poll());
    }

    public double getMedian() {
      if (maxHeap.size() == minHeap.size())
		return (maxHeap.peek() + minHeap.peek()) / 2.0;
	else
		return maxHeap.peek();
    }
  }
}

