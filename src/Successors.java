public class Successors {
  public static Position findPosition(int i, int[][] arr) {
    Position pos = null;
    for (int j = 0; j < arr.length; j++) {
      for (int k = 0; k < arr[j].length; k++) {
        if (arr[j][k] == i) {
          pos = new Position();
          break;
        }
      }
    }
    return pos;
  }

  public static Position[][] getSuccessorArray(int[][] arr) {
    Position[][] sArr = new Position[arr.length][arr[0].length];

    return sArr;
  }
}
