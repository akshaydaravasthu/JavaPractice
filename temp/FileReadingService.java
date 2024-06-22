package temp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingService {

    public void readData(String path) throws Exception{
        BufferedReader br = null;
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        br = new BufferedReader(fileReader);
        System.out.println(br.readLine());
    }
}
