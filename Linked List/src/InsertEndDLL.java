public class InsertEndDLL {
    public static void main(String[] args) {
        DNode head = null;
        head = insertEndDLL(head, 110);
        head = insertEndDLL(head, 120);
        head = insertEndDLL(head, 130);

        DoublyLinkedList.displayDLinkedList(head);

    }

    private static DNode insertEndDLL(DNode head, int data) {
        DNode newNode = new DNode(data);
        if(head == null)
            return newNode;

        DNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;

        return head;

    }
}
