/**
 * File Name: Tree.java<br>
 * Purpose: Creates a binary tree<br>
 * Created: 13.03.2020<br>
 * Modified: 13.03.2020<br>
 * Copyright: No Copyright <br>
 * @version 1.0 <br>
 * @author Morgan Firkins <br>
 * @param <T>
 */
public class Tree <T> {
	private Node<T> rootNode;
	/**
	 * Constructs a tree
	 * @param rootNode: Root of Tree
	 */
	public Tree(Node<T> rootNode) {
		this.rootNode = rootNode;
	}
	/**
	 * Set the right tree of the root node
	 * @param rightTree: Right section of Tree from Root
	 */
	public void setRightTree(Node<T> rightTree) {
		rootNode.setRightNode(rightTree);
	
	}
	/**
	 * Get the right tree of the root
	 * @return Right section from Root of Tree
	 */
	public Node<T> getRightTree() {
		return rootNode.getRightNode();
		
	}
	/**
	 * Sets the left tree of the root node
	 * @param leftTree: Left section of Tree from Root
	 */
	public void setLeftTree(Node<T> leftTree) {
		rootNode.setLeftNode(leftTree);
		
	}
	/**
	 * Get the leftTree of the root Node
	 * @return Left section of Tree from Root
	 */
	public Node<T> getLeftTree() {
		return rootNode.getLeftNode();
	}
	/**
	 * Gets the value of the root node
	 * @return Value held in root of Tree
	 */
	public T getData(){
		return rootNode.getData();
		
	}
	/**
	 * Sets the data of the rootNode
	 * @param data: Value to set current value to
	 */
	public void setData(T data) {
		rootNode.setData(data);
	}
	
}
