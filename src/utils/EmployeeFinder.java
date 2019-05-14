package utils;

import data.CollectiveProject;
import data.Record;

import java.util.List;

import static utils.PeriodCalculator.getPeriod;

public class EmployeeFinder {

    public static CollectiveProject findEmployees(List<Record> records){
        CollectiveProject project = new CollectiveProject();
        project.setPeriod(0);
        project.setFirstEmployeeId("");
        project.setSecondEmployeeId("");
        project.setProjectId("");

        for (int i = 0; i < records.size(); i++) {
            for (int j = i + 1; j < records.size(); j++) {

                Record first = records.get(i);
                Record second = records.get(j);

                if (first.getProjectId().equals(second.getProjectId())) {

                    long period = getPeriod(
                            first.getDateFrom(),
                            first.getDateTo(),
                            second.getDateFrom(),
                            second.getDateTo()
                    );

                    if (period > 0 && period > project.getPeriod()) {

                        project.setPeriod(period);
                        project.setFirstEmployeeId(first.getEmployeeId());
                        project.setSecondEmployeeId(second.getEmployeeId());
                        project.setProjectId(first.getProjectId());
                    }
                }
            }
        }
        return project;
    }
}