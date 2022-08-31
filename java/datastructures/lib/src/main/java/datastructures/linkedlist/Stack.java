package datastructures.linkedlist;

import java.io.IOException;
import java.util.EmptyStackException;

public class Stack <T>{
  private Node<T> top = null;

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
    return top.value;
  }
  public boolean isEmpty() {
    return top == null;
  }


}
