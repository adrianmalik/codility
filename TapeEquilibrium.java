import java.util.Arrays;

public class TapeEquilibrium {

    public int solution(int[] numbers) {
        int[] differences = new int[numbers.length - 1];
        boolean[] changedLeftCalculationDirections = new boolean[numbers.length - 1];
        boolean[] changedRightCalculationDirections = new boolean[numbers.length - 1];

        int sumFromLeft = 0;
        int sumFromRight = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            sumFromLeft += numbers[i];
            sumFromRight += numbers[numbers.length - 1 - i];

            calculateDifference(differences, i, sumFromLeft, changedRightCalculationDirections, changedLeftCalculationDirections);
            calculateDifference(differences, numbers.length - 2 - i, sumFromRight, changedLeftCalculationDirections, changedRightCalculationDirections);
        }

        Arrays.sort(differences);

        return differences[0];
    }

    private void calculateDifference(int[] differences, int index, int sum, boolean[] changedSourceCalculationDirections, boolean[] changedDestionationCalculationDirections) {
        if (changedSourceCalculationDirections[index]) {
            if (differences[index] < sum) {
                differences[index] = sum - differences[index];
                changedSourceCalculationDirections[index] = false;
            } else {
                differences[index] = differences[index] - sum;
            }
        } else {
            differences[index] += sum;
        }

        changedDestionationCalculationDirections[index] = true;
    }
}
