public class ImplementSLL {

    private ListNode head;

    private static class ListNode {
        private int data;  // Generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ImplementSLL sll = new ImplementSLL();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(11);
//        ListNode third = new ListNode(12);
//        ListNode fourth = new ListNode(13);
//
//        // Now form a chain b/w nodes
//        sll.head.next = second;
//        second.next = third;
//        third.next = fourth;
//
//        displayLinkedList(sll.head);
//
//        System.out.println();
//        System.out.println("Size of sll is: " + size(sll.head));
        sll.insertFirst(67);
        sll.insertFirst(68);
        sll.insertFirst(69);

        //sll.displayLinkedList(sll.head);

        sll.recursiveDisplay(sll.head);

    }

    private void recursiveDisplay(ListNode head) {
        if(head == null)
            return;
        System.out.print(head.data + " ");
        recursiveDisplay(head.next);
    }

    private static void displayLinkedList(ListNode head) {
        ListNode curr = head;

        while(curr != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    private static int size(ListNode head) {
        int count = 0;
        if(head == null)
            return 0;

        ListNode curr = head;

        while(curr.next != null) {
            count ++;
            curr = curr.next;
        }

        return count;
    }

    private void insertFirst(int value) {
        ListNode temp = new ListNode(value);

        temp.next = head;
        head = temp;


    }


}














