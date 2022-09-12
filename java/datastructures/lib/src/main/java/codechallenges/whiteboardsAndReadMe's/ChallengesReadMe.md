# Data Structure Challenges

# Animal Shelter

## Challenge
Create a class called AnimalShelter which holds only dogs and cats.
The shelter operates using a first-in, first-out approach.

## Approach and efficiency
Create a generic pseudoqueue that can take in Animals. Have dog and cats extend animals so they can be separated when sorting through the stacks. Efficiency is O(n^2).

## API
- enqueue
  - Arguments: animal
  - animal can be either a dog or a cat object.
- dequeue
  - Arguments: pref
  - pref can be either "dog" or "cat"
  - Return: either a dog or a cat, based on preference.
    - If pref is not "dog" or "cat" then return null.
