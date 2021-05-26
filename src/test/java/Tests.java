import com.meshkov.arraytask.exception.ParseIntException;
import com.meshkov.arraytask.fileio.ArrayFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;



public class Tests {
    private static final Logger logger = LogManager.getLogger();

    @Test
    public void testFileRead() throws ParseIntException, IOException {
        ArrayFromFile arrayFromFile = new ArrayFromFile();
        int[] array = arrayFromFile.getArrayFromFile();
        logger.info("------");
        for (int i : array) {
            logger.info(i);
        }
        logger.info("------");
    }
}
