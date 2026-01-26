public class University {
    private String universityName;
    private String city;

    public University(String universityName, String city) {
        this.universityName = universityName;
        this.city = city;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayInfo() {
        System.out.println("University: " + universityName + ", City: " + city);
    }
}

