import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class ReplaceAndClearlist {
    public List<String> replaceList(List<String> input,String[] old,String[] replace)
    { int i;
        for(i=0;i<old.length;i++)
        {
            if (input.contains(old[i])) {
                int index = input.indexOf(old[i]);
                input.remove(index);
                input.add(index,replace[i]);
            }
        }
        return input;
    }
    public List<String> clearList(List<String> input)
    {
        input.clear();
        return input;
    }
}
