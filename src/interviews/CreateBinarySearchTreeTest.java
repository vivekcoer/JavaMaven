package interviews;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreateBinarySearchTreeTest {

	@Test
	public void test345() {
	    CreateBinarySearchTree tree = new CreateBinarySearchTree();
	    tree.add(3);
	    tree.add(4);
	    tree.add(5);
	    assertEquals("[null,3,[null,4,[null,5,null]]]", tree.toString());
	}

	@Test
	public void test453() {
	    CreateBinarySearchTree tree = new CreateBinarySearchTree();
	    tree.add(4);
	    tree.add(5);
	    tree.add(3);
	    assertEquals("[[null,3,null],4,[null,5,null]]", tree.toString());
	}

}
