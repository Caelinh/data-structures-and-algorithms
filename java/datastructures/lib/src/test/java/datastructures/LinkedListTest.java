package datastructures;

import codechallenges.StacksAndQueues.PseudoQueue;
import datastructures.StacksAndQueues.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void testAStack(){
    Stack stack = new Stack();
    assertTrue(stack.isEmpty());
  }
  @Test void Pseudoenqueue(){
    PseudoQueue testPseudo = new PseudoQueue();
    int input = 5;
    testPseudo.enqueue(10);
    testPseudo.enqueue(15);
    testPseudo.enqueue(20);
    testPseudo.enqueue(input);
    assertEquals(input,testPseudo.peek());
  }

  @Test void PseudoDequeue(){
    PseudoQueue testPseudo = new PseudoQueue();
    int testInt = 10;
    testPseudo.enqueue(testInt);
    testPseudo.enqueue(15);
    testPseudo.enqueue(10);
    testPseudo.enqueue(5);
    assertEquals(testInt,testPseudo.dequeue());


  }

}
