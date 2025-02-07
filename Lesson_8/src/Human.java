public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Human human = (Human) obj;

        return age == human.age && (name != null ? name.equals(human.name) : human.name == null);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', age=" + age + "}";
    }
}
