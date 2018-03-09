import org.junit.Test;

import static org.junit.Assert.*;

public class SuccessorsTest {
  int[][] arr = {
      {1, 2, 3, 4, 5},
      {9, 8, 7, 6, 0},
      {10, 14, 11, 13, 12}
  };

  @Test
  public void findPositionValueNotFoundReturnsNull() {
    Position p = Successors.findPosition(42, arr);
    assertNull(Successors.findPosition(42, arr));
  }

  @Test
  public void getSuccessorArrayReturnsResultOfCorrectSize() {
    Position[][] sArr = Successors.getSuccessorArray(arr);
    assertEquals( "array rows don't match", arr.length, sArr.length);
    assertEquals( "array columns don't match",
        arr[0].length, sArr[0].length);
  }
}