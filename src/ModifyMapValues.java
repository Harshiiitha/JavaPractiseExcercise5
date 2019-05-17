import java.util.Map;

public class ModifyMapValues {
    public Map<String,String> modifyMap(Map<String,String> input)
    {
        String value1=input.get("val1");
        input.put("val2",value1);
        input.put("val1","");
        return input;
    }
}
