public class DeleteHeadDLL {
    public static void main(String[] args) {
        DNode head = new DNode(10);
        DNode temp1 = new DNode(20);
        DNode temp2 = new DNode(30);

        // connect
        head.next = temp1;
        temp1.prev = head;

        temp1.next = temp2;
        temp2.prev = temp1;

        System.out.println("Before deleting first element: ");
        DoublyLinkedList.displayDLinkedList(head);

        head = deleteHeadDLL(head);

        System.out.println("\nAfter deleting first element: ");
        DoublyLinkedList.displayDLinkedList(head);

    }

    private static DNode deleteHeadDLL(DNode head) {
        if(head == null || head.next == null)
            return null;

        head = head.next;
        head.prev = null;
        return head;
    }
}
