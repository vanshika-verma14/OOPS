public class Student2 {
    String name;
    int age;

    public Student2() {
        this.name = null;
        this.age = 0;
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student2 student1 = new Student2();
        student1.display();

        Student2 student2 = new Student2("vanshika", 20);
        student2.display();
    }
}
