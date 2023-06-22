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

  public LinkedList sumOfLinkedLists(LinkedList l1, LinkedList l2) {
    LinkedList dummy = new LinkedList(0);
    LinkedList curr = dummy;
    int carry = 0;
    while(l1!=null || l2!=null || carry == 1) {
      int sum = 0;
      if(l1 != null){ // adding l1 to our sum & moving l1
         sum += l1.value;
         l1 = l1.next;
      }
      if(l2 != null){ // adding l2 to our sum & moving l2
         sum += l2.value;
         l2 = l2.next;
      }
        sum += carry; // if we have carry then add it into our sum
        carry = sum/10;
        LinkedList temp = new LinkedList(sum%10);
        curr.next = temp;
        curr = curr.next;
    }
    return dummy.next;
  }
}
