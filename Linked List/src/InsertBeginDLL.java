public class InsertBeginDLL {

    public static void main(String[] args) {

        DNode head = null;
        head = insertBeginDLL(head, 10);
        head = insertBeginDLL(head, 20);
        head = insertBeginDLL(head, 30);

        displayDLinkedList(head);

    }

    private static DNode insertBeginDLL(DNode head, int data) {
        DNode newNode = new DNode(data);

        newNode.next = head;
        if (head != null)
            head.prev = newNode;

        head = newNode;

        return head;

    }
    private static void displayDLinkedList (DNode head){

        DNode curr = head;

        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }

}