package Tree;

public interface OriginalTree {
	/**
	 * 得到树的根节点
	 * @return
	 */
	public Node getHead();
	/**
	 * 向某一个节点添加左子树或右子树
	 * @param from from must in this Tree
	 * @param loc only "Left" or "Right"
	 */
	public void AddNode(Node from, String loc);
	/**
	 * 根据序号得到相应节点
	 * @param order
	 * @return if no matched node return null,else return matched node
	 */
	public Node SelectByOrder(int order);
}
