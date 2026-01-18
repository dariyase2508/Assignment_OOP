import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Portal {
    private String name;
    private List<JobListing> jobs = new ArrayList<>();

    public Portal(String name) {
        this.name = name;
    }

    public void publishJob(JobListing job) {
        jobs.add(job);
    }

    public void showJobs() {
        for (JobListing job : jobs) {
            System.out.println(job);
        }
    }

    public void searchJobs(String keyword) {
        for (JobListing job : jobs) {
            if (job.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(job);
            }
        }
    }

    public void sortJobsByTitle() {
        Collections.sort(jobs, Comparator.comparing(JobListing::getTitle));
    }

    @Override
    public String toString() {
        return "Portal{name='" + name + "', jobs=" + jobs.size() + "}";
    }
}