package Tree;

public interface OriginalTree {
	/**
	 * �õ����ĸ��ڵ�
	 * @return
	 */
	public Node getHead();
	/**
	 * ��ĳһ���ڵ������������������
	 * @param from from must in this Tree
	 * @param loc only "Left" or "Right"
	 */
	public void AddNode(Node from, String loc);
	/**
	 * ������ŵõ���Ӧ�ڵ�
	 * @param order
	 * @return if no matched node return null,else return matched node
	 */
	public Node SelectByOrder(int order);
}
