package by.mishastoma.customarray.reader.impl;

import by.mishastoma.customarray.exception.FileException;
import by.mishastoma.customarray.reader.FileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReaderImpl implements FileReader {

    private static final char END_OF_LINE = '\n';
    private static final Logger logger = LogManager.getLogger();

    public String readFromFile(String fileName) throws FileException {
        File file = new File(Paths.get(fileName).toUri());
        if(!file.exists()){
            logger.error("File {} not found", fileName);
            throw new FileException(String.format("File %s not found", fileName));
        }
        else{
            if(!file.canRead()){
                logger.error("File {} cannot be opened", fileName);
                throw new FileException(String.format("Can't open file %s", fileName));
            }
            else{
                try {
                    StringBuilder data = new StringBuilder();
                    Scanner reader = new Scanner(file);
                    while(reader.hasNextLine()){
                        String nextLine = reader.nextLine();
                        data.append(nextLine);
                        data.append(END_OF_LINE);
                    }
                    reader.close();
                    logger.info("Successfully got data from file {}", fileName);
                    return data.toString();
                }
                catch (Exception e){
                    logger.fatal("Unknown error with file {}", fileName);
                    e.printStackTrace();
                    throw new FileException(String.format("Unknown error with file %s", fileName));
                }
            }
        }
    }

}
