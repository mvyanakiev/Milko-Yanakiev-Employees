package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static config.Config.DATA_FORMAT;

public class Record {

    private String employeeId;
    private String projectId;
    private Date dateFrom;
    private Date dateTo;
    private SimpleDateFormat myFormat = new SimpleDateFormat(DATA_FORMAT);

    public Record() {
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getDateFrom() {
        return this.dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dataParser(dateFrom);
    }

    public Date getDateTo() {
        return this.dateTo;
    }

    public void setDateTo(String dateTo) {
        if (dateTo == null || dateTo.isEmpty()) {
            this.dateTo = new Date();
        } else {
            this.dateTo = dataParser(dateTo);
        }
    }

    private Date dataParser(String date) {
        try {
            return myFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}