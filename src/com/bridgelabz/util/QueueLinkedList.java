/****************************************************************************** 
 *  Purpose: creating a queue using linked list.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   25-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;


	class Node<T>{
		private Node<T> link;
		public T data;
		
		public Node(T mData, Node<T> node){
		data = mData;
		link = node;
		}
		
		/*
		 * method to get link of a particular node
		 */
		public Node<T> getLink(){
			return link;
		}
		
		/*
		 * method to set link in a node
		 */
		public void setLink(Node<T> rear){
			this.link=rear;
		}
		
		/*
		 * method to get data of a node
		 */
		public T getData(){
			return data;
		}
		
		/*
		 * method to set data of a node
		 */
		public void setData(T data){
			this.data = data;
		}			
	}
	
public class QueueLinkedList<T>{
		public Node<T> front;
		public Node<T> rear;
		public int sizeOfQueue;
		
		/*
		 * method to add elements in a queue linked list
		 */
		public void enQueue(T element){
			Node<T> node = new Node<T>(element,null);
			if(rear == null){
				rear = node;
				front = node;
			}
			else{
				rear.setLink(node);
				rear = rear.getLink();
			}
			sizeOfQueue++;				
		}		
		
		
		/*
		 * method to delete elements from queue linked list
		 */
		public T deQueue(){
			Node<T> node = null;
			T element = null;
			
			if(isEmpty()){
				sizeOfQueue=0;
				System.out.println("Queue is empty");
			}		
				node = front;
				front = node.getLink();
				element = node.getData();
				return element;
			}
		
		
		/*
		 * this method return whether queue is empty or not
		 */
		public boolean isEmpty(){
			return front==null ;
		}
		
		
		/*
		 * this method returns size of queue
		 */
		public int size(){
			return sizeOfQueue;
		}
		
		/*
		 * this method returns the element which is on the top
		 */
		public T peek(){
			if(isEmpty())
				System.out.println("queue is empty");
			
			return front.getData();
		}
	}


