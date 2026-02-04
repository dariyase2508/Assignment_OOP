import jakarta.persistence.*;

@Entity
@Table(name = "job_listings")
public class JobListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    public JobListing() {}

    public JobListing(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "JobListing{id=" + id + ", title='" + title + "'}";
    }
}