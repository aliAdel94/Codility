package permMissingElem;

public class PassingCars {

    public static int solution(final int A[], final int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                count = count + N - (i + 1) - 1;
            }
        }
        if (count > 1000000000) {
            return -1;
        }
        return count;
    }
}
