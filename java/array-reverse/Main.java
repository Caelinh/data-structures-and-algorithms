
public class Main {
  public static void main(String[] args) {
    int[] testArr = new int[]{ 4,3,2,1 };
    System.out.println(reverseArray(testArr));

  }

  public static int[] reverseArray(int intArray[] ) {
    int[] revArr = new int[intArray.length-1];

    for(int i = intArray.length-1; i >= 0 ; i--) {
      int x = 0;
      revArr[x] = intArray[i];

    }
    return revArr;

  }


}
