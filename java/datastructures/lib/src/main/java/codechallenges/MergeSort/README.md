# Whiteboard


## Review this pseudocode and create a whiteboard explaining it
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
       
![0](https://user-images.githubusercontent.com/106052558/191437815-d3f1f214-fc3e-4e1b-8051-19f8e7416ddd.jpg)
![0](https://user-images.githubusercontent.com/106052558/191437861-706cdb14-f334-4263-a4d9-2410fb89ce4d.jpg)


## Approach & Efficiency
For this I used recursion on the array by calling a split and then comparing values and sorting correctly when putting the array back together.
This has an efficiency of O log(n);

## Solution
To run check the testing section or call the MergeSort method on an input array of integers you would like sorted.

## resources
help with algorith from   
https://www.youtube.com/watch?v=bOk35XmHPKs&t=1086s&ab_channel=CodingwithJohn
