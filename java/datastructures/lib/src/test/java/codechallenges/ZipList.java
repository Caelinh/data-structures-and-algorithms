package codechallenges;

import codechallenges.LinkedListChallenges.LinkedListchallenge;
import datastructures.LinkedList.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ZipList {


@Test
  void zipListCheck(){
  LinkedList<Integer> sut1 = new LinkedList<>();
  LinkedList<Integer> sut2 = new LinkedList<>();
  sut1.insert(2);
  sut1.insert(3);
  sut1.insert(1);
  sut2.insert(4);
  sut2.insert(9);
  sut2.insert(5);
  LinkedListchallenge.zipList(sut1,sut2);
  String bestCase = "1--->5--->3--->9--->2--->4--->null";
  assertEquals(bestCase,sut1.convertToString().toString());
  String shortCase = "20--->40--->10--->30--->null";
  LinkedList<Integer> sut3 = new LinkedList<>();
  LinkedList<Integer> sut4 = new LinkedList<>();
  sut3.insert(10);
  sut3.insert(20);
  sut4.insert(30);
  sut4.insert(40);
  LinkedListchallenge.zipList(sut3,sut4);
  assertEquals(shortCase,sut3.convertToString().toString());
}
}
