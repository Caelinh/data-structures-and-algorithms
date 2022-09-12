package codechallenges.LinkedListChallenges;

import datastructures.LinkedList.LinkedList;
import datastructures.LinkedList.Node;

public class LinkedListchallenge {

  public static LinkedList<Integer> zipList(LinkedList<Integer> LL1, LinkedList<Integer> LL2){
    Node<Integer> c1 = LL1.getHead();
    Node<Integer> c2 = LL2.getHead();
    while (c1 != null && c2 != null ){
      Node<Integer> T1 = c1.getNext();
      Node<Integer> T2 = c2.getNext();
      if (T1 != null) {
        c2.setNext(T1);
      }
      c1.setNext(c2);
      c1 = T1;
      c2 = T2;
    }
    return LL1;
  }

}
