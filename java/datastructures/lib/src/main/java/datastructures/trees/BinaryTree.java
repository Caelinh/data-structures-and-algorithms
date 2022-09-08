package datastructures.trees;

import datastructures.StacksAndQueues.Queue;

import java.util.ArrayList;

public class BinaryTree {
  public Node root;
  ArrayList<Integer> preorderList = new ArrayList<>();
  ArrayList<Integer> inorderList = new ArrayList<>();
  ArrayList<Integer> postorderList = new ArrayList<>();


  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public ArrayList<Integer> getPreorderList() {
    return preorderList;
  }

  public ArrayList<Integer> getInorderList() {
    return inorderList;
  }

  public ArrayList<Integer> getPostorderList() {
    return postorderList;
  }


  public ArrayList<Integer> preorder(Node root) {
    if (root != null) {
      preorderList.add(root.data);
      preorder(root.left);
      preorder(root.right);
    }
    return preorderList;
  }

  public ArrayList<Integer> inorder(Node root) {
    if (root != null) {
      inorder(root.left);
      inorderList.add(root.data);
      inorder(root.right);
    }
    return inorderList;
  }

  public ArrayList<Integer> postorder(Node root) {
    if (root != null) {
      postorder(root.left);
      postorder(root.right);
      postorderList.add(root.data);
    }
    return postorderList;
  }

  public ArrayList<Integer> breadthFirst(BinaryTree tree) {
    ArrayList<Integer> treeVals = new ArrayList<>();
    Queue<Node> tracker = new Queue<>();
    tracker.enqueue(tree.getRoot());

    while (!tracker.isEmpty()) {

      Node temp = tracker.dequeue();
      treeVals.add(temp.data);

      if (temp.left != null) {
        tracker.enqueue(temp.left);
      }
      if (temp.right != null) {
        tracker.enqueue(temp.right);
      }
    }
    return treeVals;
  }
  //Help with this one from https://www.geeksforgeeks.org/level-order-tree-traversal/
}
