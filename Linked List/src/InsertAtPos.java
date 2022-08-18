public class InsertAtPos {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(11);
        Node third = new Node(12);
        Node fourth = new Node(13);

        // Now form a chain b/w nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        head = insertAtPos(head, 7, 300);

        insertEndSLL.printLinkedlist(head);

    }

    private static Node insertAtPos(Node head, int pos, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            if (pos == 1)
                return newNode;
            return null;
        }

        Node curr = head;
        for (int i = 1; i < pos - 1  && curr != null; i++) {
            curr = curr.next;
        }

       // to have if the position provided is invalid or greater than size of linked list
       if(curr == null)
           return head;
        newNode.next = curr.next;
        curr.next = newNode;

        return head;

        }

    }

