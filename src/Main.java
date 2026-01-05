public class Main {
    public static void main(String[] args) {
        University myUni = new University("ENU");
        myUni.addProfessor(new Professor("Z. Ayman", "Physics"));
        myUni.addProfessor(new Professor("A. Saparov", "CS"));
        myUni.addProfessor(new Professor("B. Tulegenova", "Math"));
        myUni.addCourse(new Course("Java Programming", 5));
        myUni.addCourse(new Course("History", 3));
        myUni.addCourse(new Course("Algorithms", 6));
        myUni.displayAllInfo();
        myUni.sortProfessorsByName();
        myUni.filterCoursesByCredits(4);
        System.out.println("\n--- Searching for 'History' ---");
        Course found = myUni.findCourse("History");
        if(found != null) {
            System.out.println("Found: " + found.toString());
        }
        Course c1 = new Course("Java", 5);
        Course c2 = new Course("Java", 5);
        System.out.println("\nAre c1 and c2 equal? " + c1.equals(c2)); // true болуы керек
    }
}
