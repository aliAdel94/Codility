package permMissingElem;


public class TapeEquilibrium {

    public static int solution(final int[] A) {
        if (A.length <= 1) {
            return 0;
        }
        int sumOfArray = 0;
        for (final int element : A) {
            sumOfArray += element;
        }
        final int array[] = new int[A.length - 1];
        int p;
        for (int i = 0; i < A.length - 1; i++) {
            p = Math.abs(2 * A[i] - sumOfArray);
            sumOfArray -= 2 * A[i];
            array[i] = p;
        }
        int temp = array[0];
        for (final int element : array) {
            if (element < temp) {
                temp = element;
            }
        }
        return temp;
    }
}
