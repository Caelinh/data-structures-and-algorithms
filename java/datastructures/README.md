# Data Structures

# Linked List

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

## Challenge Stacks and queues
Create a node class and linked list class that is able to add a node, display to string and check if a node is included.

## Approach & Efficiency
For this approach it was pretty straightforward as it was the initial implementation. The difficult part was figuring out how to iterate through the list as well as converting the values to a string.  I believe the efficiency is an O(n)
based on the amount of nodes present in the LinkedList.
## API
Insert- Adds a value to the list
Includes- checks to see if a value exists
to string- convert the linked list to a string.

### Resources used

https://www.youtube.com/c/HackerrankOfficial


# Stacks and Queues
Created Stack(Last in first out) and Queue(first in first out approach) datastructure thats able to hold any type of data.

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
- everyhting that is added is assigned as the new top of the stack.
- Peek just returns value of top node. pop removes it

Queue
- Used nodes to keep track of front and rear
- enque adds value to back of the que
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


