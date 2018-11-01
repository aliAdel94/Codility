package permMissingElem;

public class MaxCounters {

    public static int[] solution(final int N, final int[] A) {
        final int[] counters = new int[N];

        int maxC = 0;
        int lastUpdate = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                lastUpdate = maxC;
            } else {
                if (counters[A[i] - 1] < lastUpdate) {
                    counters[A[i] - 1] = lastUpdate + 1;
                } else {
                    counters[A[i] - 1]++;
                }
                if (counters[A[i] - 1] > maxC) {
                    maxC = counters[A[i] - 1];
                }
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < lastUpdate) {
                counters[i] = lastUpdate;
            }
        }
        return counters;
    }
}
