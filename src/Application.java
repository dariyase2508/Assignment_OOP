import jakarta.persistence.*;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String freelancerName;
    private Long jobId;

    public Application() {}

    public Application(String freelancerName, Long jobId) {
        this.freelancerName = freelancerName;
        this.jobId = jobId;
    }

    public Long getId() { return id; }
    public String getFreelancerName() { return freelancerName; }
    public Long getJobId() { return jobId; }

    @Override
    public String toString() {
        return "Application{freelancer='" + freelancerName + "', jobId=" + jobId + "}";
    }
}
