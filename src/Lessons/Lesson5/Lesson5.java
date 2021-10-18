package Lessons.Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Student student = new Student("Anna", 23, 89.8f,"Java, Kotlin");
        System.out.println(student);
        Student student1 = new Student();
        System.out.println(student1);
    }
}

class Student{
    String name;
    int age;
    float mark;
    String subjects;

    public Student() {
        this.name = "Anonim";
    }

    public Student (String name, int age, float mark, String subjects){
        this.name= name;
        this.age = age;
        this.mark = mark;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", subjects='" + subjects + '\'' +
                '}';
    }
}
