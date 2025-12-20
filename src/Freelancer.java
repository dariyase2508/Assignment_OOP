public class Freelancer {
    private static int counter = 1;
    private int id;
    private String name;
    private String skill;

    public Freelancer(String name, String skill) {
        this.id = counter++;
        this.name = name;
        this.skill = skill;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSkill() { return skill; }
    public void setSkill(String skill) { this.skill = skill; }

    public int getId() { return id; }

    public void printFreelancer() {
        System.out.println("Фрилансер ID: " + id + ", Имя: " + name + ", Навык: " + skill);
    }
}