import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;
    private final ApplicationRepository applicationRepository;

    public JobService(JobRepository jobRepository,
                      ApplicationRepository applicationRepository) {
        this.jobRepository = jobRepository;
        this.applicationRepository = applicationRepository;
    }

    public JobListing createJob(String title) {
        return jobRepository.save(new JobListing(title));
    }

    public List<JobListing> getAllJobs() {
        return jobRepository.findAll();
    }

    public Application applyForJob(String freelancerName, Long jobId) {
        return applicationRepository.save(new Application(freelancerName, jobId));
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
}
