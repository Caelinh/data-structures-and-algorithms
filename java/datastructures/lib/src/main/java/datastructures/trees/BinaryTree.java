package datastructures.trees;

import java.util.ArrayList;

public class BinaryTree {
  Node root;
  ArrayList<Integer> preorderList = new ArrayList<>();
  ArrayList<Integer> inorderList = new ArrayList<>();
  ArrayList<Integer> postorderList = new ArrayList<>();

  public Node getRoot() {
    return root;
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
}


