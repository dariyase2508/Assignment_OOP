public class JobListing {
    private static int counter = 1;
    private int jobId;
    private String title;

    public JobListing(String title) {
        this.jobId = counter++;
        this.title = title;
    }

    public void getInfo() {
        System.out.println("Vacancy ID: " + jobId + ", Name: " + title);
    }

    public int getJobId() {
        return jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}