package permMissingElem;

import java.text.ParseException;

class Solution {

    public String solution(final int[] T) {
        // write your code in Java SE 8
        int maxDifference = Integer.MIN_VALUE, season = -1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        final int numberEachSeason = (T.length + 1) / 4;

        for (int i = 0; i < T.length; i++) {
            if (i % numberEachSeason == 0) {
                max = Integer.MIN_VALUE;
                min = Integer.MAX_VALUE;
            }
            if (T[i] > max) {
                max = T[i];
            }
            if (T[i] < min) {
                min = T[i];
            }

            if ((i + 1) % numberEachSeason == 0 && i > 0) {
                if (max - min > maxDifference) {
                    maxDifference = max - min;
                    season = i / numberEachSeason;
                }
            }
        }
        switch (season) {
            case 0:
                return "WINTER";
            case 1:
                return "SPRING";
            case 2:
                return "SUMMER";
            case 3:
                return "AUTUMN";

            default:
                return null;
        }
    }

    public class CharElement {

        private String charr;

        private int number;

        public CharElement(final String charr, final int number) {
            this.charr = charr;
            this.number = number;
        }

        public String getCharr() {
            return charr;
        }

        public int getNumber() {
            return number;
        }

        public String decreaseNumber(final int i) {
            if (i == 1 && number > 0) {
                number = number - 1;
                return charr;
            } else if (i == 2 && number > 1) {
                number = number - 2;
                return charr + charr;
            } else if (i == 2 && number > 0) {
                number = number - 1;
                return charr;
            } else {
                return "";
            }
        }
    }

    public String solution(final int A, final int B) {
        // write your code in Java SE 8
        CharElement maxCharElement, minCharElement;
        if (A > B) {
            maxCharElement = new CharElement("a", A);
            minCharElement = new CharElement("b", B);
        } else {
            minCharElement = new CharElement("a", A);
            maxCharElement = new CharElement("b", B);
        }
        String allData = "";
        while (true) {
            if (maxCharElement.getNumber() == minCharElement.getNumber()) {
                final int loopI = maxCharElement.getNumber();
                for (int i = 0; i < loopI; i++) {
                    allData += maxCharElement.decreaseNumber(1) + minCharElement.decreaseNumber(1);
                }
                break;
            } else {
                allData += maxCharElement.decreaseNumber(2) + minCharElement.decreaseNumber(1);

            }
        }
        return allData;
    }

    public static void main(final String[] args) throws ParseException {

        System.out.println(new Solution().solution(9, 4));

    }

}
