package tukenya.ac.ke;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DFSInorderTest {

    private DFSInorder dfs;

    @Before
    public void setup() {
        this.dfs = new DFSInorder();
    }

    @After
    public void close() { }

    @Test
    public void printNodes() {
        Node root = this.dfs.intTree();
        this.dfs.printNodes(root);

        assertNotNull("Root node is null!", root);
    }

    
}
