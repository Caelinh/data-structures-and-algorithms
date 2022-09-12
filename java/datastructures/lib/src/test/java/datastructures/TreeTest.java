package datastructures;

import datastructures.trees.BinarySearchTree;
import datastructures.trees.BinaryTree;
import datastructures.trees.Node;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {

  @Test
  public void emptyTree(){
    BinaryTree bt = new BinaryTree();
    assertNotNull(bt);
  }

  @Test
  public void treeRoot(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(10);
    assertEquals(10, sut.getRoot().data);
  }

  @Test
  public void binaryTreeTest(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(15);
    sut.add(12);
    sut.add(16);
    assertEquals(12,sut.getRoot().left.data);
    assertEquals(16,sut.getRoot().right.data);
  }

  @Test
  public void preorder(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(10);sut.add(15);sut.add(32);sut.add(65);sut.add(13);
    assertEquals(10, sut.getPreorderList().get(0));

  }
  @Test
  public void inorder(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(10);sut.add(15);sut.add(32);sut.add(65);sut.add(13);
    assertEquals(13, sut.getInorderList().get(1));

  }
  @Test
  public void postorder(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(10);sut.add(15);sut.add(32);sut.add(65);sut.add(13);
    sut.postorder(sut.getRoot());
    assertEquals(32, sut.getPostorderList().get(2));
  }

}
