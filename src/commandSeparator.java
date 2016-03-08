import java.util.HashMap;

public class commandSeparator {
    public static HashMap  refineCommands(String[] args) {
        HashMap<String,String> mapper = new HashMap<String, String>();
        for (int i = 0; i < args.length; i++) {
            if (args[i].charAt(0) == '-' && args[i].charAt(1) != '-') {
                mapper.put("option", args[i]);
            } else if (args[i].charAt(0) == '-') {
                mapper.put("country", args[i]);

            }else if(args[i].charAt(0) == '_'){
                mapper.put("age", args[i]);
            }
            mapper.put("file", args[i]);
        }
        return  mapper;

    }
}
