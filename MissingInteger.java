import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingInteger {
    
    public int solution(int[] array) {
        List<Integer> list = Arrays.stream(array)
            .boxed()
            .filter(number -> number > 0)
            .collect(Collectors.toList());
        int i;
        for (i = 1; i <= list.size(); i++) {
            if (!list.contains(i)) {
                return i;
            }
        }

        return i;
    }
}
