class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList mergingLinkedLists(LinkedList l1, LinkedList l2) {
    LinkedList list1 = l1;
    LinkedList list2 = l2;
    while(list1!=list2) {
      list1 = (list1 == null) ? l1 : list1.next;
      list2 = (list2 == null) ? l2 : list2.next;
    }

    return list1;
  }
}
