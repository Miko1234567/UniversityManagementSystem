public class Main {
    public static void main(String[] args) {

        CourseDAO courseDAO = new CourseDAO();

        Course c1 = new Course("Databases", 5);
        Course c2 = new Course("Java Programming", 4);

        courseDAO.addCourse(c1);
        courseDAO.addCourse(c2);

        courseDAO.getAllCourses();

        courseDAO.updateCredits(1, 4);

        courseDAO.deleteCourse(2);
    }
}
