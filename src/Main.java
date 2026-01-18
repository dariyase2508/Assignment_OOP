import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
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

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "Yam201354";

        try (Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement()){

        stmt.executeUpdate("INSERT INTO job_listings(title) VALUES ('C++ Develepor')");

        ResultSet rs = stmt.executeQuery("SELECT * FROM job_listings");
        while(rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " + rs.getString("title")
            );
        }
        stmt.executeUpdate(
                "UPDATE job_listings SET title = 'Senior C++ Developer' WHERE id = 1"
        );
        stmt.executeUpdate(
                "DELETE FROM job_listings WHERE id = 2"
        );

        } catch(Exception e){
                e.printStackTrace();
        }
    }
}
