import by.mishastoma.customarray.reader.FileReader;
import by.mishastoma.customarray.reader.impl.FileReaderImpl;

public class App {

    public static void main(String[] args) {
        String data;
        FileReader reader = new FileReaderImpl();
        try {
            data = reader.readCustomArrayFromFile("data.txt");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
