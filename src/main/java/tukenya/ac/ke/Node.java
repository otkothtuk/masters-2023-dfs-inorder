package tukenya.ac.ke;

public class Node {

    public int value;

    public Node left;
		
    public Node right;
    
    public Node(int _value, Node _left, Node _right) {
        this.left = _left;
        this.right = _right;
        this.value = _value;
    }
    
}


