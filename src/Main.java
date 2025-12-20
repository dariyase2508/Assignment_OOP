public class Main {
    public static void main(String[] args) {
        Portal myPortal = new Portal("Freelance Empire", "www.freelance-empire.com");
        System.out.println("Информация о портале");
        myPortal.printPortal();

        JobListing job1 = new JobListing("Java Developer");
        JobListing job2 = new JobListing("Web Designer");

        System.out.println("\n Список доступных вакансий");
        job1.getInfo();
        job2.getInfo();

        Freelancer fl1 = new Freelancer("Дастан", "Java Backend");
        Freelancer fl2 = new Freelancer("Акерке", "UX/UI Design");

        System.out.println("\n Наши лучшие фрилансеры");
        fl1.printFreelancer();
        fl2.printFreelancer();

        System.out.println("\n Проверка сравнения объектов");

        if (job1.getJobId() != job2.getJobId()) {
            System.out.println("Результат: Вакансии имеют уникальные ID (" + job1.getJobId() + " и " + job2.getJobId() + ")");
        }

        if (fl1.getName().equals(fl2.getName())) {
            System.out.println("Результат: У фрилансеров одинаковые имена.");
        } else {
            System.out.println("Результат: Это два разных человека: " + fl1.getName() + " и " + fl2.getName());
        }
    }
}