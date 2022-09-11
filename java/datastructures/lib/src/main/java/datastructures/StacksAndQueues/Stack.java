package datastructures.StacksAndQueues;

import datastructures.LinkedList.Node;

import java.util.EmptyStackException;

public class Stack <T>{
  Node<T> top;

  public Stack() {
    this.top = null;
  }

  public void push(T value) {
    Node<T> node = new Node<>(value);
    node.next = top;
    top = node;
  }
  public T pop(){
    T value = null;
    try {
      value = top.value;
      top = top.next;

    } catch (EmptyStackException ex) {
      ex.printStackTrace();
    }
  return value;
  }

  public T peek() {

    try {
      return top.value;

    } catch (NullPointerException ex){
      throw new NullPointerException(ex.getMessage());
    }
  }
  public boolean isEmpty() {
    return top == null;
  }


}
