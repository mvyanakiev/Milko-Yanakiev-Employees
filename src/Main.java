import config.Config;
import data.CollectiveProject;
import data.Record;

import java.io.IOException;
import java.util.List;

import static utils.EmployeeFinder.findEmployees;
import static utils.FileReader.readFile;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Record> records = readFile(Config.FILE_PATH);
        CollectiveProject project = findEmployees(records);

        if (project.getPeriod() == 0) {
            System.out.println(Config.NO_ANSWER_MESSAGE);
        } else {
            System.out.println(project.toString());
        }
    }
}
