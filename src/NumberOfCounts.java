import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class NumberOfCounts {
    public Map<String, Integer> countNum(String input) {
        int i = 0, j = 0;
        /*Array of Strings to recognize numbers*/
        String[] single_digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Map<String, Integer> output = new HashMap<String, Integer>();
        /*loop to check occurence of count*/
       for(i=0;i<single_digits.length;i++)
       {
           int count=0;
           Pattern p=Pattern.compile(single_digits[i]);
           Matcher m=p.matcher(input);
           while(m.find())
           {
               count++;
           }
           if(count>0)
           {
               output.put(single_digits[i], count);
           }
       }
        return output;

    }
}

