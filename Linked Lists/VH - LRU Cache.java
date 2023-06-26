import java.util.*;

// Do not edit the class below except for the insertKeyValuePair,
// getValueFromKey, and getMostRecentKey methods. Feel free
// to add new properties and methods to the class.
class ListNode {
    String key;
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(String key, int val) {
        this.key = key;
        this.val = val;
    }
}

class Program {
  static class LRUCache {
    int capacity;
    Map<String, ListNode> dic;
    ListNode head;
    ListNode tail;

    public LRUCache(int capacity) {
      this.capacity = capacity;
        dic = new HashMap<>();
        head = new ListNode("-1", -1);
        tail = new ListNode("-1", -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public void add(ListNode node) {
        ListNode previousEnd = tail.prev;
        previousEnd.next = node;
        node.prev = previousEnd;
        node.next = tail;
        tail.prev = node;
    }
    
    public void remove(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insertKeyValuePair(String key, int value) {
      if (dic.containsKey(key)) {
            ListNode oldNode = dic.get(key);
            remove(oldNode);
        }
        
        ListNode node = new ListNode(key, value);
        dic.put(key, node);
        add(node);
        
        if (dic.size() > capacity) {
            ListNode nodeToDelete = head.next;
            remove(nodeToDelete);
            dic.remove(nodeToDelete.key);
        }
    }

    public LRUResult getValueFromKey(String key) {
      if (!dic.containsKey(key)) {
            return null;
        }
        LRUResult res = new LRUResult(true, dic.get(key).val);
        remove(dic.get(key));
        add(dic.get(key));
        return res;
    }

    // public void printLL() {
    //   ListNode temp = head;
    //   while(temp!=null) {
    //     System.out.print(temp.val+"->");
    //     temp = temp.next;
    //   }
    //   System.out.println("null");
    // }

    public String getMostRecentKey() {
      return tail.prev.key;
    }
  }

  static class LRUResult {
    boolean found;
    int value;

    public LRUResult(boolean found, int value) {
      this.found = found;
      this.value = value;
    }
  }
}
