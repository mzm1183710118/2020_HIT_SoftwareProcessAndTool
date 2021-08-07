package Tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public abstract class OriginalTreeTest {

	public abstract OriginalTree emptyInstance();
	@Test
	void testInstance() {
		OriginalTree T = emptyInstance();
		T.AddNode(T.getHead(), "Left");
		T.AddNode(T.SelectByOrder(2), "Right");
		assertNotEquals(null, T.SelectByOrder(1));
		assertNotEquals(null, T.SelectByOrder(5));
		assertEquals(null, T.SelectByOrder(3));
		assertEquals(null, T.SelectByOrder(4));
		assertEquals(1, T.SelectByOrder(2).getDepth());
		assertEquals(2, T.SelectByOrder(5).getDepth());
		
	}

}
