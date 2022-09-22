package codechallenges.QuickSortChallenge;

import java.util.Random;

public class QuickSortin {

  public static void quickSort(int[] array) {
    quickSort(array, 0, array.length-1);
  }

  public static void quickSort(int[] array, int lowIndex, int highIndex) {
    if (lowIndex >= highIndex) {
      return;
    }
    int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
    int pivot = array[pivotIndex];
    swap(array, pivotIndex, highIndex);

    int leftPointer = lowIndex;
    int rightPointer = highIndex;

    while (leftPointer < rightPointer) {
      while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }
      while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }
      swap(array, leftPointer, rightPointer);
    }
    swap(array, leftPointer, highIndex);

    quickSort(array, lowIndex, leftPointer - 1);
    quickSort(array, leftPointer + 1, highIndex);

  }

  public static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
