

public class SinglyLinkedList {

        private Node head;

        private static class Node{
             int data;
             Node next;

             Node (int data) {
                 this.data = data;
                 this.next = null;
             }
        }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new Node(12);
        Node temp1 = new Node(13);
        Node temp2 = new Node(14);
        Node temp3 = new Node(15);

        sll.head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;

        display(sll.head);

    }

    private static void display(Node head) {
            if(head == null)
                return;
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " --> ");
                curr = curr.next;
            }
            System.out.print("null");
    }

}
