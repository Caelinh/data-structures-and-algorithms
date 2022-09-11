package datastructures;

import datastructures.LinkedList.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestingLinkedList {

  @Test
  void LinkedListTests() {
//    Can successfully instantiate an empty linked list
    LinkedList<Integer> sut = new LinkedList<>();
    assertNull(sut.getHead());
//    Can properly insert into the linked list
    sut.insert(5);
    assertEquals(5, sut.getHead().value);
//    Can properly insert multiple nodes into the linked list
    sut.insert(10);
//    Will return true when finding a value within the linked list that exists
    assertTrue(sut.includes(10));
//    Will return false when searching for a value in the linked list that does not exist
    assertFalse(sut.includes(12));
//    Can properly return a collection of all the values that exist in the linked list
    String testString = "10--->5--->null";
    assertEquals(testString, sut.convertToString().toString());
  }
  @Test
  void LinkedListTests2() {
    //Class06
//    Can successfully add a node to the end of the linked list
    String testString2 = "3--->2--->1--->15--->null";
    LinkedList<Integer> sut2 = new LinkedList<>();
    sut2.insert(1);
    sut2.insert(2);
    sut2.insert(3);
    sut2.append(15);
    assertEquals(testString2, sut2.convertToString().toString());
//    Can successfully add multiple nodes to the end of a linked list
    LinkedList<Integer> sut3 = new LinkedList<>();
    sut3.insert(1);sut3.insert(2);sut3.insert(3);sut3.append(15);sut3.append(20);
    String testString3 = "3--->2--->1--->15--->20--->null";
    assertEquals(testString3, sut3.convertToString().toString());
//    Can successfully insert a node before a node located i the middle of a linked list
    LinkedList<Integer> sut4 = new LinkedList<>();
    sut4.insert(1);
    sut4.insert(2);
    sut4.insert(3);
    sut4.append(15);
    sut4.append(20);
    sut4.insertBefore(1,100);
    String testString4 = "3--->2--->100--->1--->15--->20--->null";
    assertEquals(testString4, sut4.convertToString().toString());
//    Can successfully insert a node before the first node of a linked list
    LinkedList<Integer> sut5 = new LinkedList<>();
    sut5.insert(1);
    sut5.insert(2);
    sut5.insert(3);
    sut5.append(15);
    sut5.append(20);
    sut5.insertBefore(3,100);
    String testString5 = "100--->3--->2--->1--->15--->20--->null";
    assertEquals(testString5, sut5.convertToString().toString());
//    Can successfully insert after a node in the middle of the linked list
    LinkedList<Integer> sut6 = new LinkedList<>();
    sut6.insert(1);
    sut6.insert(2);
    sut6.insert(3);
    sut6.append(15);
    sut6.append(20);
    sut6.insertAfter(1,100);
    String testString6 = "3--->2--->1--->100--->15--->20--->null";
    assertEquals(testString6, sut6.convertToString().toString());
//    Can successfully insert a node after the last node of the linked list
    LinkedList<Integer> sut7 = new LinkedList<>();
    sut7.insert(1);
    sut7.insert(2);
    sut7.insert(3);
    sut7.append(15);
    sut7.append(20);
    sut7.insertAfter(20,100);
    String testString7 = "3--->2--->1--->15--->20--->100--->null";
    assertEquals(testString7, sut7.convertToString().toString());
  }
  @Test
  void testingClass7(){
    LinkedList<Integer> sut = new LinkedList<>();
    sut.insert(1);
    sut.insert(2);
    sut.insert(3);
    sut.insert(4);
//    Where k is greater than the length of the linked list
    Throwable exception = assertThrows(IllegalStateException.class, () -> sut.kthFromTheEnd(6));
    assertEquals("The list isn't that long", exception.getMessage());
//    Where k and the length of the list are the same
    assertEquals(4,sut.kthFromTheEnd(4));
//    Where k is not a positive integer
    Throwable exception2 = assertThrows(IllegalStateException.class, () -> sut.kthFromTheEnd(-1));
    assertEquals("Must be a positive number", exception2.getMessage());
//    Where the linked list is of a size 1
    LinkedList<Integer> sut2 = new LinkedList<>();
    sut2.insert(2);
    assertEquals(2,sut2.kthFromTheEnd(1));
//   Happy Path where k is not at the end, but somewhere in the middle of the linked list
    assertEquals(2,sut.kthFromTheEnd(2));
  }
}
