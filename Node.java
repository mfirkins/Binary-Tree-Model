/**
 * File Name: Node.java<br>
 * Purpose: Creates new node objects<br>
 * Created: 13.03.2020<br>
 * Modified: 13.03.2020<br>
 * Copyright: No Copyright
 * @version 1.0<br>
 * @author Morgan Firkins<br>
 * @param <T>
 */
public class Node<T> {
	/**
	 * leftNode: left child of the new node
	 * rightNode:  right child of the new node
	 * data: the data to be used in the node
	 */
	private Node<T> leftNode;
	private Node<T> rightNode;
	private T data;
	/**
	 * Constructor the create node
	 * @param leftNode: node to be set as left child of new node
	 * @param rightNode: node to be set as right child of new node
	 * @param data: Data to be set as value of new node
	 */
	public Node(Node<T> leftNode, Node<T> rightNode, T data) {
		//Set attributes of object
		setLeftNode(leftNode);
		setRightNode(rightNode);
		setData(data);
	}
	/**
	 * Set the right child of node
	 * @param rightNode: node to be set as right child of the node
	 */
	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}
	/**
	 * get the right child of node
	 * @return right child of node
	 */
	public Node<T> getRightNode() {
		return this.rightNode;
	}
	/**
	 * Set the left child of node
	 * @param leftNode: node to be set as left child of the node
	 */
	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}
	/**
	 * get the left child of node
	 * @return left child of node
	 */
	public Node<T> getLeftNode(){
		return this.leftNode;
		
	}
	/**
	 * Set the actual value data of the node
	 * @param data: Data to be set as value of the node
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Get the data/value of the node
	 * @return Value of node
	 */
	public T getData() {
		return data;
		
	}
}
