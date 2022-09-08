package datastructures.LinkedList;




public class LinkedList <T>{
  Node<T> head = null;

  public void insert(T value){
    Node<T> newHead = new Node<>(value);
    newHead.next = head;
    head = newHead;
  }

  public boolean includes(T value){
    Node<T> current = head;
    while(current.next != null){
      if(current.next.value == value){
        return true;
      }
    }
    return false;
  }

  public String toString(){
    Node<T> current = head;
    String linkedlistString = "";
    while (current.next != null){
      linkedlistString += ("{"+current.value+"} -->");
    } return linkedlistString + "NULL";

  }



}

