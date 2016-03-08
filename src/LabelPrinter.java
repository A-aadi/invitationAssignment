import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
        HashMap optionsMapper = commandSeparator.refineCommands(args);
        ReadFile fileReader = new ReadFile();
        List<String> fileData = fileReader.readFile((String) optionsMapper.get("file"));
        OptionManager guestManager = new OptionManager();
        List<String> finalData = guestManager.giveGuestList( optionsMapper, fileData);
//        System.out.println(finalData.size());
//        for (int i = 0; i <finalData.size() ; i++) {
//            System.out.println(finalData.get(i));
//
//        }



    }
}
