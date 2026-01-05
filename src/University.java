import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University {
    private String name;
    private List<Professor> professors; 
    private List<Course> courses;       

    public University(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Тізімге қосу әдістері
    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    
    public Course findCourse(String courseName) {
        for (Course c : courses) {
            if (c.getCourseName().equalsIgnoreCase(courseName)) {
                return c;
            }
        }
        System.out.println("Course not found: " + courseName);
        return null;
    }

   
    public void filterCoursesByCredits(int minCredits) {
        System.out.println("\n--- Filtering: Courses with > " + minCredits + " credits ---");
        for (Course c : courses) {
            if (c.getCredits() > minCredits) {
                System.out.println(c);
            }
        }
    }

    
    public void sortProfessorsByName() {
        // Comparator қолдану
        Collections.sort(professors, Comparator.comparing(Professor::getName));
        System.out.println("\n--- Sorted Professors List ---");
        for (Professor p : professors) {
            System.out.println(p);
        }
    }

    public void displayAllInfo() {
        System.out.println("University: " + name);
        System.out.println("Total Professors: " + professors.size());
        System.out.println("Total Courses: " + courses.size());
    }
}
