import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/jobs")
    public JobListing createJob(@RequestBody JobListing job) {
        return jobService.createJob(job.getTitle());
    }

    @GetMapping("/jobs")
    public List<JobListing> getJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping("/applications")
    public Application apply(@RequestBody Application application) {
        return jobService.applyForJob(application.getFreelancerName(), application.getJobId());
    }

    @GetMapping("/applications")
    public List<Application> getApplications() {
        return jobService.getAllApplications();
    }
}