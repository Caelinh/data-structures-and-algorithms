package codechallenges;

import codechallenges.QuickSortChallenge.QuickSortin;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class QuicksortTest {

  @Test
  void testingQuicksort(){

    int [] sut = new int[] {8,4,23,42,16,15};
    int [] correct = new int[] {4,8,15,16,23,42};
    int [] sut2 = new int[]{20,18,12,8,5,-2};
    int [] correct2 = new int[]{-2,5,8,12,18,20};
    QuickSortin.quickSort(sut);
    QuickSortin.quickSort(sut2);
    assertArrayEquals(correct,sut);
    assertArrayEquals(correct2,sut2);


  }
}
