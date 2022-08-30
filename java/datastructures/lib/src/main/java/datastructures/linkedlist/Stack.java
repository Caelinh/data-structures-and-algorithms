package datastructures.linkedlist;

import java.io.IOException;
import java.util.EmptyStackException;

public class Stack {
  private Node top = null;

  public void push(int value) {
    Node node = new Node(value);
    node.next = top;
    top = node;
  }
  public int pop(){
    int value = 0;
    try {
      value = top.value;
      top = top.next;

    } catch (EmptyStackException ex) {
      ex.printStackTrace();
    }
  return value;
  }

  public int peek() {
    return top.value;
  }
  public boolean isEmpty() {
    return top == null;
  }

}
