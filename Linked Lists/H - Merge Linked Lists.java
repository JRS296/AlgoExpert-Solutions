class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    int value;
    LinkedList next;

    LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static LinkedList mergeLinkedLists(LinkedList list1, LinkedList list2) {
    LinkedList ans = new LinkedList(0);
        LinkedList ans1 = ans;
        while(list1!=null && list2!=null) {
            if(list1.value < list2.value) {
                ans1.next = list1;
                ans1 = ans1.next;
                list1 = list1.next;
            } else {
                ans1.next = list2;
                ans1 = ans1.next;
                list2 = list2.next;
            }
        }

        while(list1!=null) {
            ans1.next = list1;
            ans1 = ans1.next;
            list1 = list1.next;
        }

        while(list2!=null) {
            ans1.next = list2;
            ans1 = ans1.next;
            list2 = list2.next;
        }

        return ans.next;
  }
}
