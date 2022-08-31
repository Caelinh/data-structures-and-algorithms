package datastructures.linkedlist;

public class Queue <T>{

  private Node<T> front;
  private Node<T> back;

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
    return front.value;
  }

  public boolean isEmpty() {
    return front == null;
  }
}
