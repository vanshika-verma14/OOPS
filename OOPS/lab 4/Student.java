class Student {
    String name;
    int age;

    Student() {
        this.name = null ;
        this.age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.display();
        Student st2 = new Student("Vanshika", 20);

        st2.display();
    }
}
