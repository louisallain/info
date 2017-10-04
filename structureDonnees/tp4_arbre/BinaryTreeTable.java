package datastruct;

import java.util.Iterator;

public class BinaryTreeTable <E extends Comparable, T> implements Table<E,T> {
	
		private Node root;
		public BinaryTreeTable() {
			
			//construction d'un arbre vide
			this.root = new Node(root, root, root, null, null);
	
		}
	
		/**
		 * This method return the value corresponding to the key in the binary tree.
		 * @param key the key to search
		 * @return the value corresponding to the key in parameter
		 */
		public T select(E key) {
			
			
		}
	
		@Override
		public boolean insert(E key, T data) {
			return false;
		}
	
		@Override
		public boolean delete(E key) {
			// TODO Auto-generated method stub
			return false;
		}
		
		/**
		 * This method returns a String containing all the informations about a 
		 * binary tree.
		 * @param theN the first node where the method start, at the beginning it shoud be equals to the root of the tree
		 * @return all the informations about a binary tree
		 */
		public String toString(Node theN) {
			
			String infosLNode, infosRNode, infosNode;
			String ret;
			
			if(theN != null) {
				
				infosLNode 	= toString(theN.lSon);
				infosRNode 	= toString(theN.rSon);
				infosNode  	= new String("\ncle = "+theN.key.toString()+"\ndata = "+theN.theValue.toString()+"\n\n");
				ret 		= new String(infosLNode + infosNode + infosRNode);
			}
			else ret = new String("");
			
			return ret;
		}
		
		
		
		
		
		
		private class Node {
			
			Node lSon ;			// fils gauche (null si pas de fils gauche)
			Node rSon ;			// fils droit (null si pas de fils droit)
			Node father ;		// père (null si le nœud est root)
			T theValue ;		// donnée stockée
			E key;				// clé unique
			Node(Node leftSon, Node rightSon, Node thefather, T Value, E theKey) {
				
				lSon = leftSon;
				rSon = rightSon;
				father = thefather;
				theValue = Value;
				key = theKey;		
				
			}
			
			private Node findNode(Node theNode, E key) {
				
				if(theNode.key == key) {
					
					
				}
				
				else if(key 
			}
		
			private Node getLeftSon(){
				return lSon;	
				
			}
			private Node getRightSon(){
				return rSon;
				
			}			
			private Node getFather(){
				return father;
				
			}			
			private T getValue(){
				return theValue;
				
			}			
			private E getKey(){
				return key;
				
			}
			
			private void setLeftSon(Node newLeftSon){
				lSon = newLeftSon;
			}
			private void setRightSon(Node newRigthSon){
				rSon = newRigthSon;

			}
			private void setFather(Node newFather){
				father = newFather;

			}
			private void setTheValue(T newValue){
				theValue = newValue;

			}
		}
}
