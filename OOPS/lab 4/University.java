public class University {
    static String uniname = "UPES";
    String stname;
    University(String studentName) {
        this.stname = studentName;
    }
    static void displayUniversityName() {
        System.out.println("University: " + uniname);
    }

    void displayStudent() {
        System.out.println("Student: " + stname);
    }

    public static void main(String[] args) {
        University.displayUniversityName();
        University st1 = new University("vanshika");
        University st2 = new University("jahanvi");
        University st3 = new University("ansh");
        st1.displayStudent();
        st2.displayStudent();
        st3.displayStudent();
    }
}
