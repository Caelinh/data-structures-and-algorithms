# QuickSort
````
ALGORITHM QuickSort(arr, left, right)
if left < right
// Partition the array by setting the position of the pivot value
DEFINE position <-- Partition(arr, left, right)
// Sort the left
QuickSort(arr, left, position - 1)
// Sort the right
QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
// set a pivot value as a point of reference
DEFINE pivot <-- arr[right]
// create a variable to track the largest index of numbers lower than the defined pivot
DEFINE low <-- left - 1
for i <- left to right do
if arr[i] <= pivot
low++
Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
DEFINE temp;
temp <-- arr[i]
arr[i] <-- arr[low]
arr[low] <-- temp
````
##  Whiteboard
![QuicksortPage1](https://user-images.githubusercontent.com/106052558/191674328-0adb1aa7-a629-4de9-b741-04a6af4b3a5b.jpg)
![QuicksortPage2](https://user-images.githubusercontent.com/106052558/191674409-332d5dbb-dbd9-4dcb-8a2f-45248ffd8760.jpg)


## Approach & Efficiency
All explained in the above whiteboard.

## Solution
To run check the testing section or call the quicksort method on an input array of integers you would like sorted.

## resources
help with algorithm from
https://www.youtube.com/watch?v=h8eyY7dIiN4&t=1011s&ab_channel=CodingwithJohn
