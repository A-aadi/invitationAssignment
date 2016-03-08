import java.io.IOException;

/**
 * Created by adarshasa on 07/03/16.
 */

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
//        commandSeparator.refineCommands(args);
        ReadFile fileReader = new ReadFile();
        String s = fileReader.readFile(args[1]);

    }
}
