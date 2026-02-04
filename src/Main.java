public class Main {
    public static void main(String[] args) {

        JobService JobService = new JobService();

        // Create jobs
        JobService.createJob("Java Developer");
        JobService.createJob("Web Designer");
        JobService.createJob("Data Analyst");

        System.out.println("=== Job Listings ===");
        for (JobListing job : JobService.getAllJobs()) {
            System.out.println(job);
        }

        // Get real job IDs
        int firstJobId = JobService.getAllJobs().get(0).getId();
        int secondJobId = JobService.getAllJobs().get(1).getId();

        // Apply for jobs
        JobService.applyForJob("Dastan", firstJobId);
        JobService.applyForJob("Akerke", secondJobId);
        JobService.applyForJob("Alibek", firstJobId);

        System.out.println("\n=== Applications ===");
        for (Application app : JobService.getAllApplications()) {
            System.out.println(app);
        }
    }
}
