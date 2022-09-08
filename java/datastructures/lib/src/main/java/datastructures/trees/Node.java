package datastructures.trees;

public class Node {
  public Node left, right;
  public int data;

  public Node(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}
