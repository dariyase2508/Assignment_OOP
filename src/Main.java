public class Main {
    public static void main(String[] args) {

        Portal portal = new Portal("Freelance Zhumys");

        portal.publishJob(new JobListing("Java Developer"));
        portal.publishJob(new JobListing("Web Designer"));
        portal.publishJob(new JobListing("C++ Developer"));

        System.out.println("All jobs:");
        portal.showJobs();

        System.out.println("\nSearch result:");
        portal.searchJobs("Java");

        portal.sortJobsByTitle();
        System.out.println("\nSorted jobs:");
        portal.showJobs();

        User f1 = new Freelancer("Dastan", "Java");
        User f2 = new Freelancer("Akerke", "Design");

        System.out.println("\nFreelancers:");
        f1.printInfo();
        f2.printInfo();

        System.out.println("\nComparison:");
        System.out.println(f1.equals(f2));
    }
}
//assignment 2