public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
         if (input == null || input.length == 0) {
            return new int[0];
        }
        int countPositoves = 0;
        int sumNegatives = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                countPositoves++;
            } else if (input[i] < 0) {
                sumNegatives += input[i];
            }
        }
        return new int[] {countPositoves, sumNegatives};
    }
}