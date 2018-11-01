package permMissingElem;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DevSkiller {

    public static Map<String, String> decode(final String s) {

        final Map<String, String> hm = new HashMap<>();

        final StringTokenizer st = new StringTokenizer(s, "&");
        while (st.hasMoreTokens()) {
            final StringTokenizer newString = new StringTokenizer(st.nextToken(), "=");
            if (newString.countTokens() == 2) {
                final String key = newString.nextToken();
                final String value = newString.nextToken();
                hm.put(key, value);
            } else {
                final String key = "";
                final String value = newString.nextToken();
                hm.put(key, value);
            }
        }
        return hm;
    }
}
