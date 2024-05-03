public class BST {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public  static TreeNode search(TreeNode node, int target){
        if( node == null){
            return null;
        } else if (node.data == target) {
            return node;
        } else if (target < node.data) {
            return  search(node.left, target);
        }
        else {
            return search(node.right, target);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(13);
        TreeNode node7 = new TreeNode(7);
        TreeNode node15 = new TreeNode(15);
        TreeNode node3 = new TreeNode(3);
        TreeNode node8 = new TreeNode(8);
        TreeNode node14= new TreeNode(14);
        TreeNode node19 = new TreeNode(19);
        TreeNode node18 = new TreeNode(18);

        root.left = node7;
        root.right = node15;

        node7.left = node3;
        node7.right = node8;

        node15.left = node14;
        node15.right = node19;

        node19.left = node18;

        //search for a value
        TreeNode result = search(root,8);
        if (result != null){
            System.out.println("Found the node with value: " + result.data);
        } else {
            System.out.println("Value not found in the BST");
        }
    }
}
