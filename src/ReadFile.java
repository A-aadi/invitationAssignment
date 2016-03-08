import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ReadFile {
    public List<String> readFile(String fileName) throws IOException {
        List<String> contents = null;
        File file = new File(fileName);
        try {
            contents = Files.readAllLines(file.toPath(), Charset.defaultCharset());
        }catch (IOException e){
            System.out.println("file not found, please give a right path of the file");
        }
        return contents;
    }

}
