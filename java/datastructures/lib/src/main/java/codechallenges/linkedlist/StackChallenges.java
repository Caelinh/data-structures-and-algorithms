package codechallenges.linkedlist;

import datastructures.linkedlist.Queue;


public class StackChallenges {

  public static boolean validateBrackets(String input) {

    String[] inputArr = input.split("");
    Queue<String> checkBrackets = new Queue<>();
    int leftB = 0;
    int rightB = 0;
    int leftC = 0;
    int rightC = 0;
    int leftP = 0;
    int rightP = 0;


    for (String entry :
      inputArr) {
      checkBrackets.enqueue(entry);
    }
    while (checkBrackets.peek() != null) {
      switch (checkBrackets.dequeue()) {
        case "[" -> leftB += 1;
        case "]" -> rightB += 1;
        case "{" -> leftC += 1;
        case "}" -> rightC += 1;
        case "(" -> leftP += 1;
        case ")" -> rightP += 1;
      }
    }
    return (leftB + rightB % 2 == 0) && (leftC + rightC % 2 == 0) && (leftP + rightP % 2 == 0);

    }
  }

