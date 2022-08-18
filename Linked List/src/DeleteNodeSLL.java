public class DeleteNodeSLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(11);
        Node third = new Node(12);
        Node fourth = new Node(13);

        // Now form a chain b/w nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        insertEndSLL.printLinkedlist(head);
        head = delHead(head);

        System.out.println("\n After deleting the first element from the singly Linked List: ");
        insertEndSLL.printLinkedlist(head);

        System.out.println("\n After deleting the last element from the singly Linked List: ");
        head = deleteEnd(head);
        insertEndSLL.printLinkedlist(head);




    }

    private static Node deleteEnd(Node head) {
        if(head == null || head.next == null)
            return null;

        Node curr = head;

        while (curr.next.next != null)
            curr = curr.next;

        curr.next = null;
        return head;
    }

    private static Node delHead(Node head) {
        if(head == null)
            return null;
        else
            return head.next;
    }
}
























