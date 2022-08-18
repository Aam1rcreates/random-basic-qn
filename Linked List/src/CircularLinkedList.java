class CNode{
    int data;
    CNode next;
    
    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CircularLinkedList {

    public static void main(String[] args) {
        CNode head = new CNode(10);
        head.next = new CNode(20);
        head.next .next= new CNode(30);
        head.next.next.next = new CNode(40);
        head.next.next.next.next = head;
        //head.next = head;
        
        printCLinkedList(head);


    }

    public static void printCLinkedList(CNode head) {
        if(head == null)
            return;

        System.out.print(head.data);

        for (CNode curr = head.next; curr != head ; curr = curr.next) {
            System.out.print("-->" + curr.data );
        }



    }

}
