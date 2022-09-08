package codechallenges;

import datastructures.trees.BinaryTree;
import datastructures.trees.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BreadthFirst {

  @Test
  void testBreadthFirst() {
    BinaryTree sut = new BinaryTree();
    sut.root = new Node(1);
    sut.root.left = new Node(2);
    sut.root.right = new Node(3);
    sut.root.left.left = new Node(4);
    sut.root.left.right = new Node(5);
    Integer[] exp = new Integer[]{1,2,3,4,5};
    assertArrayEquals(exp,sut.breadthFirst(sut).toArray());


  }
}
