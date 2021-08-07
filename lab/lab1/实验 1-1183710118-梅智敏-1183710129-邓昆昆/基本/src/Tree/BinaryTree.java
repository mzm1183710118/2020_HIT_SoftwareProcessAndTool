package Tree;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree implements OriginalTree{
	private final Node Head = new Node(1, 220, 10, 0, Color.red, null, null);
	private final List<Node> nodes = new ArrayList<>();
	private List<Integer> ScalableNodes = new ArrayList<>();
	{
		nodes.add(Head);
		ScalableNodes.add(1);
	
	}


	public List<Integer> getScalableNodes() {
		return ScalableNodes;
	}

	public void setScalableNodes(List<Integer> scalableNodes) {
		ScalableNodes = scalableNodes;
	}

	public List<Node> getNodes() {
		return nodes;
	}
	
	@Override
	public Node getHead() {
		return Head;
	}
	
	@Override
	public void AddNode(Node from, String loc) {
		Node node;
		if(loc.equals("Left")) {
			node = new Node(from.getOrder()*2, from.getX()-100/(1<<from.getDepth()), from.getY()+50, from.getDepth()+1, Color.red, null, null);
			from.setLnode(node);
			if(from.getRnode() != null) {
				ScalableNodes.remove((Integer)from.getOrder());
			}
		}
		else {
			node = new Node(from.getOrder()*2+1, from.getX()+100/(1<<from.getDepth()), from.getY()+50, from.getDepth()+1, Color.red, null, null);
			from.setRnode(node);
			if(from.getLnode() != null) {
				ScalableNodes.remove((Integer)from.getOrder());
			}
		}
		nodes.add(node);
		ScalableNodes.add(node.getOrder());
	}
	@Override
	public Node SelectByOrder(int order) {
		for(Node node : nodes) {
			if(node.getOrder() == order) {
				return node;
			}
		}
		return null;
	}
	
//	public void DeleteNode(Node node) {
//		if(node.getLnode().equals(null) && node.getRnode().equals(null)) {
//			nodes.remove(node);
//		}
//		
//	}
}
