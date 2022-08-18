public class SearchSLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(11);
        Node third = new Node(12);
        Node fourth = new Node(13);

        // Now form a chain b/w nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        insertEndSLL.printLinkedlist(head);

        System.out.println("\n" + rSearchSll(head, 13));


       // System.out.println("\n" + searchSll(head, 19));
    }

    private static int rSearchSll(Node head, int find) {
        if(head == null)
            return -1;
        if(head.data == find)
            return 1;
        int result = rSearchSll(head.next, find);
        if(result == -1)
            return -1;
        return result+1;
    }

    private static int searchSll(Node head, int find) {

        Node curr = head;
        int found = 1;

        while(curr != null){
            if(curr.data == find)
                return found;
            curr = curr.next;
            found++;
        }
        return -1;
    }
}
