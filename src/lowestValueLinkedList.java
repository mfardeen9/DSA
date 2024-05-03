public class lowestValueLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }


    }
    public static void main(String[] args) {
    //creating individual node
        Node node1 = new Node(2);
        Node node2 = new Node(4);
        Node node3 = new Node(9);
        Node node4 = new Node(23);

        //linking nodes together
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //calling function to print node

        System.out.println("Lowest value: " +lowestValue(node1) );

    }
    public static int lowestValue(Node head){
        int minval = head.data;
        Node curentnode = head.next;
        while ( curentnode != null){
            if (minval > curentnode.data){
                 minval = curentnode.data; ;
            }
            curentnode = curentnode.next;
        }
    return minval;
    }
}
