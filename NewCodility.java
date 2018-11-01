package permMissingElem;


public class NewCodility {

    public static int solution(final int A, final int B, final int K) {
        int numOfDiv = 0;
        final int diff = B - A;
        if (A - B == 0) {
            if (A % K == 0) {
                numOfDiv += 1;
            }
        }
        if (diff % 2 > 0) {
            numOfDiv += 1;
        }
        if (diff > K && K % 2 > 0) {
            numOfDiv += 1;
        }
        numOfDiv += diff / K;
        return numOfDiv;
    }
}
