package datastructures.StacksAndQueues;

import datastructures.LinkedList.Node;

import java.util.EmptyStackException;

public class Queue <T>{

  public Node<T> front;
  public Node<T> back;

  public Queue() {
    this.front = null;
    this.back = null;
  }

  public Node<T> getFront() {
    return front;
  }

  public void setFront(Node<T> front) {
    this.front = front;
  }

  public Node<T> getBack() {
    return back;
  }

  public void setBack(Node<T> back) {
    this.back = back;
  }

  public void enqueue(T value){
    Node<T> node = new Node<>(value);
    if (back != null){
      back.next = node;
    }
    back = node;

    if(front == null) {
      front = node;
    }
  }
  public T dequeue() {
    T value = front.value;
    front = front.next;
    if (front == null) {
      back = null;
    }
    return value;
  }

  public T peek(){
    try {
    return this.front.value;
    }catch (Exception ignore){}
    return null;
  }

  public boolean isEmpty() {
    return front == null;
  }

}
