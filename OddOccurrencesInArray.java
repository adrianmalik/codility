import java.util.Set;
import java.util.HashSet;

public class OddOccurrencesInArray {

    public int solution(int[] numbers) {
        Set<Integer> numbersSet = new HashSet<>();
        for (int number: numbers) {
            if (numbersSet.contains(number)) {
                numbersSet.remove(number);    
            } else {
                numbersSet.add(number);    
            }
        }
        
        return numbersSet.iterator().next();
    }
}
