import java.io.IOException;

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
//        commandSeparator.refineCommands(args);
        ReadFile fileReader = new ReadFile();
        String s = fileReader.readFile(args[1]);

    }
}
