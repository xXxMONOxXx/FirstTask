package test.mishastoma.customarray.reader.impl;

import by.mishastoma.customarray.exception.FileException;
import by.mishastoma.customarray.reader.FileReader;
import by.mishastoma.customarray.reader.impl.FileReaderImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileReaderTest {

    private final FileReader reader = new FileReaderImpl();

    @Test
            (expectedExceptions = FileException.class)
    public void nonexistentFileTest() throws FileException {
        reader.readFromFile("nonexistent.txt");
    }

    @Test
    public void oneLineFileTest() throws FileException {
        String actual = reader.readFromFile("src/test/resources/data/oneLineReaderTest.txt");
        String expected = "4;           -10;         0;              8; - 1; -6";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void emptyFileTest() throws FileException {
        String actual = reader.readFromFile("src/test/resources/data/emptyReaderTest.txt");
        String expected = "";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void threeLinesTest() throws FileException {
        String actual = reader.readFromFile("src/test/resources/data/threeLinesReaderTest.txt");
        String expected = "9;            0; -10; -1;     -9; -6; 2;   -8; 5\n" +
                "-3;   -7\n" +
                "9;    -5; -8";
        Assert.assertEquals(actual, expected);
    }
}
