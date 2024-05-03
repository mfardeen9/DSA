
public class linkedListDoubly {
  static class Node {
      int data;
      Node next;
      Node prev;
      Node(int data){
          this.data = data;
          this.next = null;
          this.prev = null;
      }
  }
    public static void main(String[] args) {
        //creating individual node
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        //linking nodes together
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.prev = node3;
        node3.prev = node2;
        node2.prev = node1;

        //printing node forward
        Node currentnode = node1;
        System.out.print("Forward: ");
        while (currentnode != null){
            System.out.print(currentnode.data +" -> ");
            currentnode = currentnode.next;
        }
        System.out.println("null");

        //printing node backward
        Node currentNode = node4;
        System.out.print("Backward: ");
        while(currentNode != null){
            System.out.print(currentNode.data +" -> ");
            currentNode = currentNode.prev;
        }
        System.out.println("null");
    }
}
