import by.mishastoma.customarray.entity.CustomArray;
import by.mishastoma.customarray.parse.CustomArrayParser;
import by.mishastoma.customarray.parse.impl.CustomArrayParserImpl;
import by.mishastoma.customarray.reader.FileReader;
import by.mishastoma.customarray.reader.impl.FileReaderImpl;
import by.mishastoma.customarray.validator.StringValidator;
import by.mishastoma.customarray.validator.impl.StringValidatorImpl;

public class Main {

    public static void main(String[] args) {
        CustomArray arrayIdOne = new CustomArray();
        CustomArray arrayIdTwo = new CustomArray();
        System.out.println(arrayIdOne.getId());
        System.out.println(arrayIdTwo.getId());
    }

    /*
    assertTrue();
    assertFalse();
     */
}
