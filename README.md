# Table of Contents 401 Code Challenges

# Data Structures

## [Whiteboards](https://github.com/Caelinh/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/codechallenges/whiteboardsAndReadMe's) and  [Challenges](https://github.com/Caelinh/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/codechallenges/whiteboardsAndReadMe's/ChallengesReadMe.md)

# Linked List 

## [Code](https://github.com/Caelinh/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/datastructures/LinkedList) / [Tests](https://github.com/Caelinh/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/TestingLinkedList.java) / 
## Challenge
Create a node class and linked list class that is able to add a node, display to string and check if a node is included.

## Approach & Efficiency
For this approach it was pretty straightforward as it was the initial implementation. The difficult part was figuring out how to iterate through the list as well as converting the values to a string.  I believe the efficiency is a O(n)

## API
- insert
    - Arguments: value
    - Returns: nothing
    - Adds a new node with that value to the head of the list with an O(1) Time performance.
- includes
  - Arguments: value
  - Returns: Boolean
  - Indicates whether that value exists as a Node’s value somewhere within the list.
- to string
    - Arguments: none
    - Returns: a string representing all the values in the Linked List, formatted as:
    - "{ a } -> { b } -> { c } -> NULL"

# More linked lists

## [Code](https://github.com/Caelinh/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/datastructures/LinkedList) / [Tests](https://github.com/Caelinh/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/TestingLinkedList.java)

## Challenge

Extend the implementation of the Linked List class to include appending, inserting before a value, and inserting after a value.
## Approach & Efficiency

The important part of this challenge was keeping track of the node that is being shifted whenever a new one is added in. The key to solving this was setting the replacement nodes next before placing into the linked list. The time efficiency of these are O(n) due to the size of the linked list that is being iterated on.
## API
- append
    - arguments: new value
    - adds a new node with the given value to the end of the list
- insert before
  - arguments: value, new value
  - adds a new node with the given new value immediately before the first node that has the value specified
- insert after
  - arguments: value, new value
  -  adds a new node with the given new value immediately after the first node that has the value specified


# Stacks and Queues

## [Code](https://github.com/Caelinh/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/datastructures/StacksAndQueues) / [Tests](https://github.com/Caelinh/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/stacksAndQueues.java) / [Challenges](https://github.com/Caelinh/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/codechallenges/StacksAndQueues)

## Challenge
Create a Stack class with the following methods
- Push
- Pop
- Peek
- isEmpty

Create a Queue Class with the following methods
- enqueue
- dequeue
- peek
- isEmpty

## Approach & Efficiency
Stack
- Used nodes to keep track of position
- created a top to keep track of top of stack
- everything that is added is assigned as the new top of the stack.
- Peek just returns value of top node. pop removes it

Queue
- Used nodes to keep track of front and rear
- enqueue adds value to back of the que
- dequeue removes from the front of the queue

## API
**STACK**
- push
    - Arguments: value
    - adds a new node with that value to the top of the stack with an O(1) Time performance.
- pop
    - Arguments: none
    - Returns: the value from node from the top of the stack
    - Removes the node from the top of the stack
    - Should raise exception when called on empty stack
- peek
    - Arguments: none
    - Returns: Value of the node located at the top of the stack
    - Should raise exception when called on empty stack
- is empty
    - Arguments: none
    - Returns: Boolean indicating whether or not the stack is empty.


# Pseudoqueue

## [Code](https://github.com/Caelinh/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/main/java/codechallenges/StacksAndQueues/PseudoQueue.java) / [Tests](https://github.com/Caelinh/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/codechallenges/PseudoQueueTests.java)

## Challenge
Create a new class called pseudo queue.
- Do not use an existing Queue.
- Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below),
  - Internally, utilize 2 Stack instances to create and manage the queue
## Approach & Efficiency
I created a pseudoqueue class with only two stacks that control the contents. TO get the FIFO approach to work I set up the logic to always ensure the first stack is clear before pushing a value. THe second stack is there to hold all the contents of the first while it is being rearranged. To remove something from the pseudo all the contents are pushed top the second stack and the last thing left in the first is popped out.
## API
- enqueue
  - Arguments: value
  - Inserts value into the PseudoQueue, using a first-in, first-out approach.

- dequeue
  - Arguments: none
  - Extracts a value from the PseudoQueue, using a first-in, first-out approach.

![Pseudoqueue](https://user-images.githubusercontent.com/106052558/189577699-d8bcad98-fde5-4f14-873b-57de2fe82752.jpg)


# Binary Tree/ Search tree

## [Code](https://github.com/Caelinh/data-structures-and-algorithms/tree/main/java/datastructures/lib/src/main/java/datastructures/trees) / [Tests](https://github.com/Caelinh/data-structures-and-algorithms/blob/main/java/datastructures/lib/src/test/java/datastructures/TreeTest.java)

## Challenge
Create a Binary Tree class
Define a method for each of the depth first traversals:
- pre order
- in order
- post order which returns an array of the values, ordered appropriately.
## Approach & Efficiency
- Created a tree that is contains nodes that have  value of a left and a right. The tree is created from branching nodes that extend from a base root.
  - The pre order traversal uses recursion to give the contents of an entered tree using the order of value,recursion left, recursion right.
  - the in order uses recursion left, value, recursion right.
  - The post order uses left recursion ,right recursion, value.
- Binary search tree enters value from least to greatest from left to right by comparing each value to it's parent node before adding to the tree. Starting at the root.
 - less than goes left and greater to the right.
 - Contains uses the previous order methods to check every value for the passed value.
## API
- Add
  - Arguments: value
  - Return: nothing
  - Adds a new node with that value in the correct location in the binary search tree.
- Contains
  - Argument: value
  - Returns: boolean indicating whether or not the value is in the tree at least once.




### Resources used
- Help from Joshua Frazer and Mandy Mason
- https://www.youtube.com/c/HackerrankOfficial
- GeeksforGeeks.org
