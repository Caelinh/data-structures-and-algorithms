package codechallenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import codechallenges.MergeSort.MergeSortChallenge;

public class MergeSortTests {


  int [] sut = new int[]{123,76,12,987,43,63,787};
  int [] correct = new int[]{12,43,63,76,123,787,987};
  @Test
  void mergingTest(){

    assertArrayEquals(correct,MergeSortChallenge.mergeSort(sut));


  }


}
