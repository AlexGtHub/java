public class lecture {
    private String name;
    private String id;
    private String faculty;
    private String course;

    public lecture(String name, String id, String faculty, String course) {
        this.name = name;
        this.id = id;
        this.faculty = faculty;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
}
