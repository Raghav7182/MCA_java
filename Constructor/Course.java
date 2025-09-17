class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "ABC Institute";

    Course(String n, int d, double f) {
        courseName = n;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 5000);
        c1.displayCourseDetails();
        Course.updateInstituteName("Chitkara University");
        Course c2 = new Course("Python", 2, 4000);
        c2.displayCourseDetails();
    }
}
