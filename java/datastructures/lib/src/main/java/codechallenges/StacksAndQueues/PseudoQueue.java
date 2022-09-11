package codechallenges.StacksAndQueues;

import datastructures.StacksAndQueues.Stack;

public class PseudoQueue <T>{

  private Stack<T> firstStack;
  private Stack<T> secondStack;

  public PseudoQueue() {
    this.firstStack = new Stack<>();
    this.secondStack = new Stack<>();
  }

  public void enqueue(T value) {
  if (secondStack.isEmpty()){
    firstStack.push(value);
  } else while(!secondStack.isEmpty()){
    firstStack.push(secondStack.pop());
  }firstStack.push(value);

  }

  public T dequeue() {
    while (!firstStack.isEmpty()){
      secondStack.push(firstStack.pop());
    }
    return secondStack.pop();
  }

  public T dequeue(T pref) {
    while (!firstStack.isEmpty()){
      secondStack.push(firstStack.pop());
    }
    while (secondStack.peek() != pref){
      firstStack.push(secondStack.pop());
    }
    if (secondStack.pop() == null){
      return firstStack.pop();
    } else return secondStack.pop();

  }

  public T peek() {
    return firstStack.peek();
  }

}
