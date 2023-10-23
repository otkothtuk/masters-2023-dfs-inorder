package tukenya.ac.ke;

public class DFSInorder {

    public Node intTree() {
        Node four = new Node(4, null, null);
        Node five = new Node(5, null, null);
        Node two = new Node(2, four, five);
        Node three = new Node(3, null, null);
        Node one = new Node(1, two, three);
        
        return one;
    }
    
    public void printNodes(Node node) {
        if (node == null) {
            return;
        }
        
        printNodes(node.left);
        System.out.println(node.value);
        printNodes(node.right);	
    }    
}
