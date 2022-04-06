package Labs.Lab06;

public class Tree {
    private String name;
    private int age;
    private boolean isAlive;

    public Tree(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }
    public Tree(String name, int age) {
        this(name,age, true);
    }
    public Tree() {
        this("No name",0, false);
        System.out.println("Сработал пустой конструктор без параметров");
    }

    @Override
    public String toString() {
        return "Дерево " + name +
                "{Возраст " + age + " лет, " +
                ((isAlive) ? "Живое" : "Не Живое") +
                '}';
    }
}