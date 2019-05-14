package utils;

import data.Record;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<Record> readFile(String path) throws IOException {
    List<Record> records = new ArrayList<>();
        FileInputStream fileStream = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));
        String strLine;

        while ((strLine = br.readLine()) != null)   {

            String [] token = strLine.split(", ");

            Record record = new Record();

            record.setEmployeeId(token[0].trim());
            record.setProjectId(token[1].trim());
            record.setDateFrom(token[2].trim());

            if (token.length > 3) {
                record.setDateTo(token[3].trim());
            } else {
                record.setDateTo("");
            }
            records.add(record);
        }
        fileStream.close();

        return records;
    }
}
