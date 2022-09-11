package datastructures;

import datastructures.StacksAndQueues.Queue;
import datastructures.StacksAndQueues.Stack;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

public class stacksAndQueues {

  @Test
  void Stack(){
    Stack<Integer> sut = new Stack<>();
    assertTrue(sut.isEmpty());
    sut.push(10);
    sut.push(15);
    assertEquals(15,sut.peek());
    assertEquals(15,sut.pop());
    assertEquals(10,sut.pop());
    assertTrue(sut.isEmpty());
  }

  @Test
  void Queue(){
    Queue<Integer> sut = new Queue<>();
    assertTrue(sut.isEmpty());
    sut.enqueue(10);
    sut.enqueue(12);
    assertEquals(10,sut.dequeue());
    assertEquals(12,sut.peek());
    sut.dequeue();
    assertTrue(sut.isEmpty());

  }


}
