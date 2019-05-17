import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class CheckOccurenceOfString {
    public Map<String, Boolean> checkString(String[] input) {
        Map<String, Boolean> output = new HashMap<String, Boolean>();

            for (int i = 0; i < input.length; i++) {
                int count = 0;

                for (int j = 0; j < input.length; j++) {
                    if (input[i].equals(input[j])) {
                        count++;
                    }
                }
                if (count >= 2) {
                    output.put(input[i], true);
                } else {
                    output.put(input[i], false);
                }
            }
        return output;
    }

}
