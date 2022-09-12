# Data Structure Challenges

# Animal Shelter

## Challenge
Create a class called AnimalShelter which holds only dogs and cats.
The shelter operates using a first-in, first-out approach.

## Approach and efficiency
Create a generic pseudo queue that can take in Animals. Have dog and cats extend animals so they can be separated when sorting through the stacks. Efficiency is O(n^2).

## API
- enqueue
  - Arguments: animal
  - animal can be either a dog or a cat object.
- dequeue
  - Arguments: pref
  - pref can be either "dog" or "cat"
  - Return: either a dog or a cat, based on preference.
    - If pref is not "dog" or "cat" then return null.

# Zip Lists

## Challenge
- Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the the zipped list.
- Try and keep additional space down to O(1)
- You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.
## Approach and efficiency
For this challenge I felt it was important to make sure to keep track of what each lists current node had as a next and to set a temporary value to store it.
After doing this the list basically iterates like a zig-zag. Once the value of the first current takes the second the currents are basically set to the temporary nexts that were
just created to hold position and we can iterate through the list the rest of this way.
## API
- Takes in 2 LinkedList Arguments and combines them together into the first linked list parameter.
