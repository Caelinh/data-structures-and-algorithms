package codechallenges.StacksAndQueues;

import datastructures.StacksAndQueues.Queue;


public class StackChallenges {

  public static boolean validateBrackets(String input) {

    char[] inputArr;
    inputArr = input.toCharArray();
    Queue<Character> checkBrackets = new Queue<>();
    int leftB = 0;
    int rightB = 0;
    int leftC = 0;
    int rightC = 0;
    int leftP = 0;
    int rightP = 0;

    for (char entry :
      inputArr) {
      checkBrackets.enqueue(entry);
    }
    while (checkBrackets.peek() != null) {

      switch (checkBrackets.dequeue().toString()) {
        case "[" -> leftB += 1;
        case "]" -> rightB += 1;
        case "{" -> leftC += 1;
        case "}" -> rightC += 1;
        case "(" -> leftP += 1;
        case ")" -> rightP += 1;
      }
    }
    return (leftB == rightB) && (leftC == rightC) && (leftP == rightP);
    }
  }

