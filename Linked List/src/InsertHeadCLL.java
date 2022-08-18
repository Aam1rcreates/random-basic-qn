

public class InsertHeadCLL {
    public static void main(String[] args) {
        CNode head = new CNode(10);
        head.next = new CNode(20);
        head.next .next= new CNode(30);
        head.next.next.next = new CNode(40);
        head.next.next.next.next = head;

        System.out.println("\nBefore adding new head: ");
        CircularLinkedList.printCLinkedList(head);

        head = insertBeginCLL(head, 101);

        System.out.println("\nAfter adding new head: ");
        CircularLinkedList.printCLinkedList(head);

        head = insertBeginCLL2(head, 102);

        System.out.println("\nAfter adding new head in 0(1) time: ");
        CircularLinkedList.printCLinkedList(head);


    }


    // Time: 0(1)
    private static CNode insertBeginCLL2(CNode head, int data) {
        CNode newNode = new CNode(data);

        if(head == null){
            newNode.next = newNode;
            return newNode;
        }

        newNode.next = head.next;
        head.next = newNode;

        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;

        return head;
    }


    // Time: 0(n)
    private static CNode insertBeginCLL(CNode head, int data) {
        CNode newNode = new CNode(data);

        if(head == null)
            newNode.next = newNode;

        CNode curr = head;

        while(curr.next != head)
            curr = curr.next;

        curr.next = newNode;
        newNode.next = head;
        return newNode;
    }
}
