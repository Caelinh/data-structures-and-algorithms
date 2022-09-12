package codechallenges;

import datastructures.LinkedList.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class kthFromTheEndTest {
  @Test
  void testingClass7(){
    //class 07
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
