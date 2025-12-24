public class Main {
    public static void main(String[] args) {
        Portal newPortal = new Portal("Freelance Zhumys", "www.freelance-zhumys.com");
        System.out.println("Portal:");
        newPortal.printPortal();

        JobListing job1 = new JobListing("C++ Developer");
        JobListing job2 = new JobListing("Web Designer");

        System.out.println("\n List of jobs");
        job1.getInfo();
        job2.getInfo();

        Freelancer fl1 = new Freelancer("Dastan", "Java Backend");
        Freelancer fl2 = new Freelancer("Akerke", "UX/UI Design");

        System.out.println("\n Best Freelancers");
        fl1.printFreelancer();
        fl2.printFreelancer();

        System.out.println("\n Object comparison");

        if (job1.getJobId() != job2.getJobId()) {
            System.out.println("Unique ID (" + job1.getJobId() + " and " + job2.getJobId() + ")");
        }

        if (fl1.getName().equals(fl2.getName())) {
            System.out.println("Result: The same names");
        } else {
            System.out.println("Result:It is two different people " + fl1.getName() + " and " + fl2.getName());
        }
    }
}