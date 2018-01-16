import java.util.Set;
import java.util.HashSet;

class Solution {

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
