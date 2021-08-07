package Tree;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree implements OriginalTree{
	private final Node Head = new Node(1, 220, 10, 0, Color.red, null, null);
	private final int MaxDepth = 4;
	private final List<Node> nodes = new ArrayList<>();
	private List<Integer> ScalableNodes = new ArrayList<>();
	private final List<Integer> TravelOrder = new ArrayList<>();
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
		if(node.getDepth() != 4) {
			ScalableNodes.add(node.getOrder());
		}
		
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
	
	public List<Integer> getTravelOrder(String text) {
		TravelOrder.clear();
		switch(text) {
			case "前序遍历":preTravel(Head);break;
			case "中序遍历":inTravel(Head);break;
			case "后序遍历":postTravel(Head);break;
			default:break;
		}
		return TravelOrder;
	}
	private void preTravel(Node root) {
        if (root != null) {
            //System.out.print(root.val + "->");
        	TravelOrder.add(root.getOrder());
        	preTravel(root.getLnode());
        	preTravel(root.getRnode());
        }
    }
	private void inTravel(Node root) {
		if (root != null) {
			inTravel(root.getLnode());
			TravelOrder.add(root.getOrder());
            inTravel(root.getRnode());
        }
	}
	private void postTravel(Node root) {
		if (root != null) {
			postTravel(root.getLnode());
			postTravel(root.getRnode());
			TravelOrder.add(root.getOrder()); 
	     }
	}
//	public void DeleteNode(Node node) {
//		if(node.getLnode().equals(null) && node.getRnode().equals(null)) {
//			nodes.remove(node);
//		}
//		
//	}
}
