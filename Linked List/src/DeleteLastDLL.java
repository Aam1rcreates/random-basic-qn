public class DeleteLastDLL {
    public static void main(String[] args) {
        DNode head = new DNode(10);
        DNode temp1 = new DNode(20);
        DNode temp2 = new DNode(30);

        // connect
        head.next = temp1;
        temp1.prev = head;

        temp1.next = temp2;
        temp2.prev = temp1;

        System.out.println("Before deleting last element: ");
        DoublyLinkedList.displayDLinkedList(head);

        head = deleteLastDLL(head);

        System.out.println("\nAfter deleting last element: ");
        DoublyLinkedList.displayDLinkedList(head);
    }

    private static DNode deleteLastDLL(DNode head) {
        if(head == null || head.next == null)
            return null;

        DNode curr = head;

        while(curr.next != null)
            curr = curr.next;

        curr.prev.next = null;
        return head;

    }
}













