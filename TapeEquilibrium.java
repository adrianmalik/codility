import java.util.stream.IntStream;

class TapeEquilibrium {
    
    public int solution(int[] numbers) {
        int minDiff = Integer.MAX_VALUE;

        int leftSum = 0;
        int rightSum = IntStream.of(numbers).sum();
        for (int i = 0; i < numbers.length - 1; i++) {
            leftSum += numbers[i];
            rightSum -= numbers[i];

            int diff = Math.abs(leftSum - rightSum);
            if (minDiff > diff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
