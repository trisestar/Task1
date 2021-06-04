import com.meshkov.arraytask.entity.CustomArray;
import com.meshkov.arraytask.parser.Parser;
import com.meshkov.arraytask.reader.Reader;
import com.meshkov.arraytask.reader.StreamReader;
import com.meshkov.arraytask.service.impl.ServiceImpl;
import com.meshkov.arraytask.service.impl.SortImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.Arrays;


public class Tests {
    private static final Logger logger = LogManager.getLogger();


    @Test
    public void sortTest() {
        SortImpl sortImpl = new SortImpl();
        CustomArray array = new CustomArray(5, -1, 8, 0, 4);

        CustomArray result = sortImpl.bubbleSort(array);
        logger.info("bubbleSort");
        for (int elem : result.getArray()) {
            logger.info(elem + " ");
        }
        logger.info("");




        result = sortImpl.shuttleSort(array);
        logger.info("shuttleSort");
        for (int elem : result.getArray()) {
            logger.info(elem + " ");
        }
        logger.info("");


        result = sortImpl.insertionSort(array);
        logger.info("insertionSort");
        for (int elem : result.getArray()) {
            logger.info(elem + " ");
        }
        logger.info("");

    }

    @Test
    public void testFileRead() {

        String str = Reader.readFile("src\\main\\resources\\array.txt");
        logger.info(str);
    }


    @Test
    public void parserTest() {

        String str = Reader.readFile("src\\main\\resources\\array.txt");
        CustomArray customArray = Parser.findSuitableArray(str);
        for (int elem : customArray.getArray()) {
            logger.info(elem + " ");
        }

    }


    @Test
    public void streamSortTest() {

        CustomArray customArray = new CustomArray(5, -1, 8, 0, 4);
        SortImpl sort = new SortImpl();
        customArray = sort.streamSort(customArray);
        for (int elem : customArray.getArray()) {
            logger.info(elem + " ");
        }

    }


    @Test
    public void streamReader() {

        String str = StreamReader.readFile("src\\main\\resources\\array.txt");

        logger.info(str);

    }


    @Test
    public void arrToStrTest() {

        CustomArray customArray = new CustomArray(5, -1, 8, 0, 4);
        String result = Arrays.toString(customArray.getArray());
        logger.info(result);
    }

    @Test
    public void sumStreamTest() {
        ServiceImpl service = new ServiceImpl();
        CustomArray customArray = new CustomArray(5, -1, 8, 0, 4);
        String result = String.valueOf(service.sumStream(customArray));
        logger.info(result);
    }

    @Test
    public void avgStreamTest() {
        ServiceImpl service = new ServiceImpl();
        CustomArray customArray = new CustomArray(5, -1, 8, 0, 4);
        String result = String.valueOf(service.averageValueStream(customArray));
        logger.info(result);
    }

    @Test
    public void minMaxStreamTest() {
        ServiceImpl service = new ServiceImpl();
        CustomArray customArray = new CustomArray(5, -1, 8, 0, 4);
        String result = "";
        result += service.findMinStream(customArray);
        result += " ";
        result += service.findMaxStream(customArray);
        logger.info(result);
    }

    @Test
    public void posNegStreamTest() {
        ServiceImpl service = new ServiceImpl();
        CustomArray customArray = new CustomArray(5, -1, 8, 0, 4);
        String result = "";
        result += service.findNumOfNegativeStream(customArray);
        result += " ";
        result += service.findNumOfPositiveStream(customArray);
        logger.info(result);
    }

    @Test
    public void zerosToMinusOneStreamTest() {
        ServiceImpl service = new ServiceImpl();
        CustomArray customArray = new CustomArray(5, -1, 8, 0, 4);
        String result = "";
        for (int elem : service.zerosToMinusOneStream(customArray)){
            result+=elem;
            result+=" ";
        }

        logger.info(result);
    }
}
