import java.util.Arrays;

public class PermCheck {
  public int solution(int[] array) {
      Arrays.sort(array);

      if (array[0] != 1) {
          return 0;
      }

      for (int i = 0; i < array.length - 1; i++) {
          if (array[i] + 1 != array[i + 1]) {
              return 0;
          }
      }

      return 1;
  }
}
