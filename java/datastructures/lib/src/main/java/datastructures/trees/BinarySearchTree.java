package datastructures.trees;

public class BinarySearchTree extends BinaryTree {

  public BinarySearchTree() {
  }

  public static Node addRecursive(Node current, int value) {
    if (current == null) {
      return new Node((value));
    }
    if (value < current.data) {
      current.left = addRecursive(current.left, value);
    } else if (value > current.data) {
      current.right = addRecursive(current.right, value);
    } else {
      return current;
    }
    return current;
  }

  public void add(int value) {
    root = addRecursive(root, value);
  }

  private boolean containsNodeRecursive(Node current, int value) {
    if (current == null) {
      return false;
    }
    if (value == current.data) {
      return true;
    }
    return value < current.data
      ? containsNodeRecursive(current.left, value)
      : containsNodeRecursive(current.right, value);
  }

  public boolean contains(int value) {
    return containsNodeRecursive(root, value);
  }


}
