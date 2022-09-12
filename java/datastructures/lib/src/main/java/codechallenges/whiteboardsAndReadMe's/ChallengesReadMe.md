# Data Structure Challenges

# Linked List

## Zip Lists
![Zipped List](https://user-images.githubusercontent.com/106052558/189578651-fecedc4e-22cc-4902-b723-6ed41c11a66f.jpg)

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

## Kth from the end
![Kth from the end](https://user-images.githubusercontent.com/106052558/189578449-7f79bfc3-8c96-4d72-8b64-6351930424f1.jpg)

## Challenge
Find the value located the end of a linked list with the passed in value k.  

## Approach and efficiency
I added a length property to the linked list so that it would be easier to just subtract k from the length so that we know how many times to iterate through. After that it's as easy as a for loop and returning the value of the current after it's finished.

## API
Method kthFromTheEnd(int k){}

# Stacks and queues

## Animal Shelter
![Animal shelter](https://user-images.githubusercontent.com/106052558/189578468-5928f843-751d-4692-9ddf-a92ae9d31717.jpg)

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
  

## Bracket check
![Stack brackets](https://user-images.githubusercontent.com/106052558/189579104-16278a9e-7354-4f41-ac91-2c7961980f6c.jpg)

## Challenge

Create a method that takes in a string and checks that every square/curly bracket and parenthesis has it's pair and return a boolean.  

## Approach and efficiency
For this challenge I converted the input string into a character array and pushed each value into a queue. I then made a loop to iterate through the queue to count how many of each braket type i have. If the left bracket count matches the right bracket count it returns true. TIme efficiency of O(n) based on how big the string is.  


