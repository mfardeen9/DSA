public class node2delete {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        //creating individual nodes
        Node node1 = new Node(2);
        Node node2 = new Node(12);
        Node node3 = new Node(21);
        Node node4 = new Node(71);
        Node node5 = new Node(29);

        //linking individual nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        //printing the node before deletion
        System.out.println("Nodes Before");
        traverseAndPrint(node1);

        //printing the node after node deletion
        node1 = deleteNode(node1,node4);
        System.out.println("After deletion");
        traverseAndPrint(node1);

    }
    public static void traverseAndPrint(Node head){
        Node currentnode = head;
        while (currentnode !=null){
            System.out.print(currentnode.data +" -> ");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }

   public static Node deleteNode(Node head, Node nodetodelete){
        Node currentnode = head;
        if (currentnode == nodetodelete){
            return head.next;
        }
        while (currentnode.next !=null && currentnode.next != nodetodelete){
            currentnode = currentnode.next;
        }
        if (currentnode.next == null){
            return head;
        }
        currentnode.next = currentnode.next.next;
        return head;
   }
}
