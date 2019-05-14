package data;

public class CollectiveProject {

    private String projectId;
    private String firstEmployeeId;
    private String secondEmployeeId;
    private long period;

    public CollectiveProject() {
    }

    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getFirstEmployeeId() {
        return this.firstEmployeeId;
    }

    public void setFirstEmployeeId(String firstEmployeeId) {
        this.firstEmployeeId = firstEmployeeId;
    }

    public String getSecondEmployeeId() {
        return this.secondEmployeeId;
    }

    public void setSecondEmployeeId(String secondEmployeeId) {
        this.secondEmployeeId = secondEmployeeId;
    }

    public long getPeriod() {
        return this.period;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("First employee ID: %s", this.firstEmployeeId)).append(System.lineSeparator());
        result.append(String.format("Second employee ID: %s", this.secondEmployeeId)).append(System.lineSeparator());
        result.append(String.format("Project ID: %s", this.projectId)).append(System.lineSeparator());
        result.append(String.format("Days: %d", this.period));

        return result.toString().trim();
    }
}