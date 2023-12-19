package Inheritance;

public class TheObjectClass extends Object {

    public static void main(String[] args) {

        Student max = new Student("Max", 22);
        System.out.println(max);
        System.out.println(max.toString());
        Student duplicate = max;
        System.out.println(duplicate);
        Student another = new Student("Another", 33);
        System.out.println(another);
        System.out.println(max == duplicate);
        System.out.println(max == another);

        PrimarySchoolStudent primary = new PrimarySchoolStudent("Adam", 6, "John");
        System.out.println(primary);
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

/*    @Override
    public String toString() {
        return super.toString();
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

        //return name + " is " + age;   //can be customized
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid is " + super.toString();
    }
}
