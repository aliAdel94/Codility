package permMissingElem;


public class MissingInteger {

    public static int solution(final int[] A) {

        final int smallestInteger = 1;
        final int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 1 || A[i] > A.length) {
                continue;
            } else {
                B[A[i] - 1] = 1;
            }
        }
        for (int i = 0; i < B.length; i++) {
            if (B[i] != smallestInteger) {
                return i + 1;
            }
        }
        return A.length + 1;
    }
}
