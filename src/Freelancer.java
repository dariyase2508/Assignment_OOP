public class Freelancer extends User {
    private static int counter = 1;
    private int id;
    private String skill;

    public Freelancer(String name, String skill) {
        super(name);
        this.id = counter++;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Freelancer{id=" + id + ", name='" + name + "', skill='" + skill + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Freelancer that = (Freelancer) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}