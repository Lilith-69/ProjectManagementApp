import java.util.Date;

public class ProjectManagementApp {
    public static void main(String[] args) {
        // Example usage of project management functionalities
        trackProjectProgress();
        calculateDeadlines();
        assignResources();
    }

    public static void trackProjectProgress() {
        // Simulating tracking project progress using for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("Project progress: " + i * 10 + "%");
        }
    }

    public static void calculateDeadlines() {
        // Simulating calculating deadlines
        Date currentDate = new Date();
        long currentTime = currentDate.getTime();
        long deadline = currentTime + 7 * 24 * 60 * 60 * 1000; // 7 days from now
        Date deadlineDate = new Date(deadline);
        System.out.println("Deadline for the project: " + deadlineDate);
    }

    public static void assignResources() {
        // Simulating assigning resources
        String[] resources = {"Resource 1", "Resource 2", "Resource 3"};
        System.out.println("Assigned resources:");
        for (String resource : resources) {
            System.out.println(resource);
        }
    }
}
