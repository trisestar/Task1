import com.meshkov.arraytask.entity.CustomArray;
import com.meshkov.arraytask.parser.Parser;
import com.meshkov.arraytask.reader.Reader;
import com.meshkov.arraytask.reader.StreamReader;
import com.meshkov.arraytask.service.impl.SortImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.awt.*;


public class Tests {
    private static final Logger logger = LogManager.getLogger();


    @Test
    public void sortTest() {
        SortImpl sortImpl = new SortImpl();

        CustomArray array = new CustomArray(5, -1 , 8 , 0, 4);


        CustomArray result = sortImpl.bubbleSort(array);
        System.out.println("bubbleSort");
        for (int i : result.getArray()){
            System.out.print(i + " ");
        }
        System.out.println();


        result = sortImpl.shuttleSort(array);
        System.out.println("shuttleSort");
        for (int i : result.getArray()){
            System.out.print(i + " ");
        }
        System.out.println();


        result = sortImpl.insertionSort(array);
        System.out.println("insertionSort");
        for (int i : result.getArray()){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    @Test
    public void testFileRead(){

        String str = Reader.readFile("src\\main\\resources\\array.txt");
        System.out.println(str);
    }


    @Test
    public void parserTest(){

        String str = Reader.readFile("src\\main\\resources\\array.txt");
        CustomArray customArray = Parser.findSuitableArray(str);
        for (int i : customArray.getArray()){
            System.out.print(i + " ");
        }

    }


    @Test
    public void streamSortTest(){

        CustomArray customArray = new CustomArray(5, -1 , 8 , 0, 4);
        SortImpl sort = new SortImpl();
        customArray = sort.streamSort(customArray);
        for (int i : customArray.getArray()){
            System.out.print(i + " ");
        }

    }


    @Test
    public void streamReader(){

        String str = StreamReader.readFile("src\\main\\resources\\array.txt");

        System.out.println(str);

    }


}
