package codechallenges;


import codechallenges.StacksAndQueues.PseudoQueue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTests {
  @Test
void checkPseudo(){
    PseudoQueue<Integer> sut = new PseudoQueue<>();
    sut.enqueue(10);
    //checking if value can be queued and if peek works
    assertEquals(10,sut.peek());
    sut.enqueue(12);
    //multiple value enqueue check
    assertEquals(12,sut.peek());
    //checking fifo works
    assertEquals(10,sut.dequeue());
    sut.dequeue();
    //Testing empty pseudoQueue
    Throwable exception = assertThrows(NullPointerException.class, sut::peek);
    assertEquals("Cannot read field \"value\" because \"this.top\" is null", exception.getMessage());
  }
}
