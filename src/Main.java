public class Main {
    public static void main(String[] args) {

        University university = new University("ENU", "Astana");

        Professor professor1 = new Professor("A. Saparov", "Computer Science");
        Professor professor2 = new Professor("B. Tulegenova", "Mathematics");

        Course course1 = new Course("Object Oriented Programming", 5);
        Course course2 = new Course("Algorithms", 4);

        university.displayInfo();

        professor1.displayInfo();
        professor2.displayInfo();

        course1.displayInfo();
        course2.displayInfo();

        // Compare courses
        if (course1.getCredits() > course2.getCredits()) {
            System.out.println(course1.getCourseName() + " has more credits than " + course2.getCourseName());
        } else {
            System.out.println(course2.getCourseName() + " has more credits than " + course1.getCourseName());
        }
    }
}
