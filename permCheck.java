package permMissingElem;

public class permCheck {

    public static int solution(final int[] A) {
        final int length = A.length;
        for (int i = 0; i < length; i++) {
            if (A[i] > length) {
                return 0;
            }
        }


        final int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            final int temp = A[i];
            arr[temp - 1] = temp;
        }
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                return 0;
            }
        }
        return 1;
    }

}
