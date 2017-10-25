package com.bridgelabz.util;

public class QueueArray<T> {

	private  int rear =-1, front = -1;
	private  int queueSize, currentSize=0;
	private  T[] array;
	
	public QueueArray(int size){
		queueSize = size;
		array = (T[]) new Object[queueSize];
	}
	
	/*
	 * method to add elements to queue array
	 */
	public void enQueue(T element){
		if(isFull()){
			System.out.println("queue is full. cannot insert element");
		}
		else{
			rear++;
			array[rear] = element;
			currentSize++;
			if(rear == queueSize-1){
				rear=0;
			}
		}		
	}	
	
	
	/*
	 * method to delete element from queue array
	 */
	public T deQueue(){
		if(isEmpty())
			System.out.println("queue is empty. cannot delete elements");
		else
			front++;
			if (front == queueSize)
			front = 0;
		
			T element = array[front];
			currentSize--;
		return element;
	}
	
	
	/*
	 * method to check if queue is full or not
	 */
	public boolean isFull(){
		return (currentSize == queueSize);
	}
	
	/*
	 * method to check if queue is empty or not
	 */
	public boolean isEmpty(){
		return(currentSize == 0);	
	}
}
