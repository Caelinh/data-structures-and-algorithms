package datastructures.linkedlist;

public class Queue {

  private Node front;
  private Node back;

  public void enqueue(int value){
    Node node = new Node(value);
    if (back != null){
      back.next = node;
    }
    back = node;

    if(front == null) {
      front = node;
    }
  }
  public int dequeue() {
    int value = front.value;
    front = front.next;
    if (front == null) {
      back = null;
    }
    return value;
  }

  public int peek(){
    return front.value;
  }

  public boolean isEmpty() {
    return front == null;
  }
}
