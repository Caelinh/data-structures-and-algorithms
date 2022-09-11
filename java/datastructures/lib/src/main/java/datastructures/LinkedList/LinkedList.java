package datastructures.LinkedList;


import java.util.ArrayList;

public class LinkedList <T>{
  Node<T> head = null;
  ArrayList<String> values = new ArrayList<>();
  int length = 0;

  public Node<T> getHead() {
    return head;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setHead(Node<T> head) {
    this.head = head;
  }

  public void insert(T value){
    Node<T> newHead = new Node<>(value);
    newHead.next = head;
    head = newHead;
    length++;
  }

  public boolean includes(T value){
    Node<T> current = head;
    while(current.next != null){
      if(current.value == value){
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public StringBuilder convertToString(){
    Node<T> current = head;
    while(current != null){
    values.add(current.value.toString());
    current = current.next;
    }
    StringBuilder answer = new StringBuilder();

    for (String value:
         values) {
      answer.append(value).append("--->");
    }
    answer.append("null");
    return answer;
  }

  //CLASS 06

  public void append(T value){
    Node<T> current = this.head;
    Node<T> node = new Node<>(value);
    if(this.head == null){
      insert(value);
    }else {
      while (current.next != null) {
        current = current.next;
      }
      current.next = node;
      length++;
    }

  }

  public void insertBefore(T value, T newValue) {
    Node<T> current = this.head;
    Node<T> newNode = new Node<>(newValue);
    if (this.head == null || this.head.value == value){
      insert(newValue);
    }else {
      while (current.next != null) {
        if (current.next.value == value) {
          newNode.setNext(current.next);
          current.next = newNode;
          length++;
          return;
        }
        current = current.next;
      }
    }

  }

  public void insertAfter(T value, T newValue) {
    Node<T> current = this.head;
    Node<T> newNode = new Node<>(newValue);
    if (this.head == null){
      insert(value);
    } else {
      while (current != null) {
        if (current.value == value) {
          newNode.next = current.next;
          current.next = newNode;
          length++;
        }
        current = current.next;
      }
    }

  }

  public int kthFromTheEnd(int k){
    int posWanted = this.getLength() - k;
    Node<T> current = this.head;
    if (k==length){return (int) current.value;}
    if (k >= 0) {
      if (posWanted >= 0) {
        for (int i = 0; i < posWanted; i++) {
          current = current.next;
        }
        return (int) current.value;
      } else throw new IllegalStateException("The list isn't that long");
    } else throw new IllegalStateException("Must be a positive number");

  }



}

