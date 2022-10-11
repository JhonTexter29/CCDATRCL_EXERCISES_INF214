// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        Node President = new Node("President");  // Create root node
       
        Node Vice = new Node("Vice President");
        
        Node Secretary = new Node("Secretary");
       
        Node Member1 = new Node("Member1");
        
        Node Member2 = new Node("`Member2");
       
        Node Member3 = new Node("Member3");
       
        Node Member4 = new Node("Member4");

        // Set left and right child of root node A
        President.left = Vice;
        President.right = Secretary;

        // Set left and right child of node B
        Vice.left = Member1;
        Vice.right =Member2;

        // Set left and right child of node C
        Secretary.left = Member3;
        Secretary.right = Member4;

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(President);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(President);

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(President);

    }
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
          // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
   // Traverse Postorder method
   static void traversePostOrder(Node node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.data);

    }
    
    }
   }
