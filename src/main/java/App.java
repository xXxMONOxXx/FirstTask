import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.parse.CustomArrayParser;
import by.mishastoma.customarray.parse.impl.CustomArrayParserImpl;
import by.mishastoma.customarray.reader.FileReader;
import by.mishastoma.customarray.reader.impl.FileReaderImpl;
import by.mishastoma.customarray.validator.StringValidator;
import by.mishastoma.customarray.validator.impl.StringValidatorImpl;

public class App {

    public static void main(String[] args) {
        FileReader reader = new FileReaderImpl();
        try {
            String data=reader.readFromFile("data.txt");
            System.out.println(data);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    /*
    array == null || array.getArray()==null
    assertTrue();
    assertFalse();
     */
}
