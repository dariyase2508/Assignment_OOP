public class JobListing {
    private static int counter = 1;
    private int id;
    private String title;

    public JobListing(String title) {
        this.id = counter++;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "JobListing{id=" + id + ", title='" + title + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobListing job = (JobListing) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}