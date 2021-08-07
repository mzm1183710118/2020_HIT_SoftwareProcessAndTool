package Tree;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void test() {
		Node A = new Node(1, 20, 20, 0, Color.BLACK, null, null);
		assertEquals(1, A.getOrder());
		assertEquals(20, A.getX());
		assertEquals(20, A.getY());
		assertEquals(0, A.getDepth());
		assertEquals(Color.black, A.getColor());
		assertEquals(null, A.getLnode());
		assertEquals(null, A.getRnode());
	}

}
