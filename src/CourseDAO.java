import java.sql.*;

public class CourseDAO {

    // CREATE (write)
    public void addCourse(Course course) {
        String sql = "INSERT INTO course(course_name, credits) VALUES (?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, course.getCourseName());
            ps.setInt(2, course.getCredits());
            ps.executeUpdate();

            System.out.println("Course added successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public void getAllCourses() {
        String sql = "SELECT * FROM course";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("course_name") + " | " +
                                rs.getInt("credits")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateCredits(int id, int newCredits) {
        String sql = "UPDATE course SET credits=? WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, newCredits);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("Course updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteCourse(int id) {
        String sql = "DELETE FROM course WHERE id=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Course deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
