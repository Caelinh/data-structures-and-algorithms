package datastructures.linkedlist;

import java.util.EmptyStackException;

public class Queue <T>{

  public Node<T> front;
  public Node<T> back;

  public Queue() {
    this.front = null;
    this.back = null;
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
    if(this.front == null){
      throw new EmptyStackException();
    }
    return this.front.value;
  }

  public boolean isEmpty() {
    return front == null;
  }

}
