
public class insertEndSLL {
    public static void main(String[] args) {
        Node head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);

        printLinkedlist(head);

    }

    public static void printLinkedlist(Node head) {
        if(head == null) {
            System.out.print("null");
            return;
        }
        System.out.print(head.data + "-->");
        printLinkedlist(head.next);
    }

    private static Node insertEnd(Node head, int value) {
        Node newNode = new Node(value);
        if(head ==null)
            return newNode;

        Node curr = head;

        while(curr.next != null)
            curr = curr.next;

        curr.next = newNode;
        return head;
    }
}
