package Tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeTest extends OriginalTreeTest{

	@Test
	void test() {
		BinaryTree T = new BinaryTree();
		Node head = T.getHead();
		assertEquals(1, head.getOrder());
		T.AddNode(head, "Left");
		assertEquals(2, T.getNodes().size());
		assertEquals(2, T.getScalableNodes().size());
		T.AddNode(head, "Right");
		assertEquals(3, T.getNodes().size());
		assertEquals(2, T.getScalableNodes().size());
		assertEquals("[1, 2, 3]", T.getTravelOrder("ǰ�����").toString());
		assertEquals("[2, 1, 3]", T.getTravelOrder("�������").toString());
		assertEquals("[2, 3, 1]", T.getTravelOrder("�������").toString());
	}

	@Override
	public OriginalTree emptyInstance() {
		// TODO Auto-generated method stub
		return new BinaryTree();
	}

}
