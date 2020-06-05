package selenium.uj.project.utils;

import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CustomCsvDataReader {

    public Object[][] readCsvData(String fileName) {

        Object[][] data = null;

        try {
            List<String[]> d = new CSVReaderBuilder(
                    Files.newBufferedReader(
                            new CustomFile().getResourceFilePath(fileName))
            ).withSkipLines(1).build().readAll();

            data = new Object[d.size()][];

            for (int x = 0; x < d.size(); x++) {
                data[x] = d.get(x);
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return data;
    }
}
