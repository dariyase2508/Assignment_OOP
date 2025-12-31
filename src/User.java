public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printInfo();

    @Override
    public String toString() {
        return "User{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}