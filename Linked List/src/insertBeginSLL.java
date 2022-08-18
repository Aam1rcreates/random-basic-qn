class Node {
    int data;
    Node next;

    Node (int data) {
        this.data = data;
        this.next = null;
    }

}

public class insertBeginSLL {
    public static void main(String[] args) {

        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);

        printLinkedList(head);


    }

    // recursive display method
    private static void printLinkedList(Node head) {
        if(head == null) {
            System.out.print("null");
            return;
        }
        System.out.print(head.data + "-->");
        printLinkedList(head.next);
    }

    // Since we are inserting at the beginning of the list, the order we insert
    // the linked list will store in the list in reverse order

    // time complexity is 0(1) /constant time
    private static Node insertBegin(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }
}
