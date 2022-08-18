public class ReverseDLL {
    public static void main(String[] args) {
        DNode head = new DNode(10);
        DNode temp1 = new DNode(20);
        DNode temp2 = new DNode(30);

        // connect
        head.next = temp1;
        temp1.prev = head;

        temp1.next = temp2;
        temp2.prev = temp1;

        head = reverseDLL(head);

        DoublyLinkedList.displayDLinkedList(head);

    }

    private static DNode reverseDLL(DNode head) {

        if(head == null || head.next == null)
            return head;

        DNode previous = null;
        DNode curr = head;
        while(curr != null){
            // swap
            previous = curr.prev;
            curr.prev = curr.next;
            curr.next = previous;

            curr = curr.prev; // prev & next is swapped
        }
        return previous.prev;
    }
}
