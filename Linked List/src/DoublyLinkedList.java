class DNode{
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {

        DNode head = new DNode(10);
        DNode temp1 = new DNode(20);
        DNode temp2 = new DNode(30);

        // connect
        head.next = temp1;
        temp1.prev = head;

        temp1.next = temp2;
        temp2.prev = temp1;

    }

    public static void displayDLinkedList (DNode head){

        DNode curr = head;

        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
