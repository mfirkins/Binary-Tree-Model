/**
 * File Name: Main<br>
 * Purpose: Adds some objects to tree<br>
 * Created: 13.03.2020<br>
 * Modified: 13.03.2020<br>
 * Copyright: No Copyright<br>
 * @version 1.0<br>
 * @author Morgan Firkins
 */
public class Main {
	/**
	 * Purpose: This main method is used to model a binary tree. The code in 
	 * this method is purely as example of how to create new Node & Tree Objects, 
	 * and the methods associated with them.
	 * @param args
	 */
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<Integer>(null,null,5); //add new node
		Node<Integer> n2 = new Node<Integer>(null,null,3);//add new node
		n1.setLeftNode(n2); //set left node
		System.out.println(n1.getData()); //get node
		System.out.println(n1.getLeftNode().getData()); //get node
		Node<String> rlc = new Node<String>(null,null,"Class 66"); //add new node
		Node<String> rrc = new Node<String>(null,null,"Class 70");//add new node
		Node<String> lrc = new Node<String>(null,null,"Class 31");//add new node
		Node<String> llc = new Node<String>(null,null,"Class 20"); //add new node
		Node<String> rn = new Node<String>(rlc,rrc,"Class 68"); //add new node
		Node<String> ln = new Node<String>(llc,lrc,"Class 24");//add new node
		Node<String> rtn = new Node<String>(ln,rn,"Class 37");//add new node
		Tree<String> t1 = new Tree<String>(rtn);//add new node
		System.out.println(t1.toString());

	}

}
