public class linkedListSingle {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    public static void main(String[] args) {
    //CREATING INDIVIDUAL NODES
        Node firstNode = new Node(3);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(13);
        Node fourthNode = new Node(2);

    //Linking Nodes Together
    firstNode.next = secondNode;
    secondNode.next = thirdNode;
    thirdNode.next = fourthNode;

    //Printing Linked List
        Node currentNode = firstNode;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
}
