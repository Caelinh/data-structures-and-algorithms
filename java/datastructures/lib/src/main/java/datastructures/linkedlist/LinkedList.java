package datastructures.linkedlist;




public class LinkedList {
  Node head = null;

  public void insert(int value){
    Node newHead = new Node(value);
    newHead.next = head;
    head = newHead;
  }

  public boolean includes(int value){
    Node current = head;
    while(current.next != null){
      if(current.next.value == value){
        return true;
      }
    }
    return false;
  }

  public String toString(){
    Node current = head;
    String linkedlistString = "";
    while (current.next != null){
      linkedlistString += ("{"+current.value+"} -->");
    } return linkedlistString + "NULL";

  }



}

