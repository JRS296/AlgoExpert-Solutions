class Program {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;
        public LinkedList prev;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public LinkedList zipLinkedList(LinkedList head) {
        if (head == null || head.next == null)
            return head;

        // finding middle element
        LinkedList slow = head;
        LinkedList fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reversing the second half of the list
        LinkedList newNode = reverseList(slow.next);
        // breaking the list from the middle
        slow.next = null;
        // merging both list
        // first half list pointer
        LinkedList curr = head;
        // second half list pointer
        LinkedList dummy = newNode;
        while (head != null && dummy != null) {
            // pointer to store next element of curr(1st half list)
            LinkedList temp = curr.next;
            // link element of 1st half to that of second half
            curr.next = dummy;
            // pointer to store next element of dummy(2nd half list)
            LinkedList temp2 = dummy.next;
            // link the rest of the first half list
            dummy.next = temp;
            // increment curr and dummy pointer to do the same thing again and again util we
            // reach end of the any one list or both list
            curr = temp;
            dummy = temp2;
        }
        return head;
    }

    public LinkedList reverseList(LinkedList node) {
        LinkedList prev = null;
        LinkedList curr = node;
        LinkedList next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
