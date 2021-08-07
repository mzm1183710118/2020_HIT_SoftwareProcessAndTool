package Tree;

import java.awt.Color;

public class Node {
	private final int order, x, y, depth;
	private Node lnode, rnode;
	private Color color;
	public Node(int order, int x, int y, int depth, Color color, Node lnode, Node rnode) {
		super();	
		this.order = order;
		this.x = x;
		this.y = y;
		this.depth = depth;
		this.color = color;
		this.lnode = lnode;
		this.rnode = rnode;
	}
	
	public int getDepth() {
		return depth;
	}

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Node getLnode() {
		return lnode;
	}
	public void setLnode(Node lnode) {
		this.lnode = lnode;
	}
	public Node getRnode() {
		return rnode;
	}
	public void setRnode(Node rnode) {
		this.rnode = rnode;
	}
	public int getOrder() {
		return order;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lnode == null) ? 0 : lnode.hashCode());
		result = prime * result + order;
		result = prime * result + ((rnode == null) ? 0 : rnode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (lnode == null) {
			if (other.lnode != null)
				return false;
		} else if (!lnode.equals(other.lnode))
			return false;
		if (order != other.order)
			return false;
		if (rnode == null) {
			if (other.rnode != null)
				return false;
		} else if (!rnode.equals(other.rnode))
			return false;
		return true;
	}
	
	
}
