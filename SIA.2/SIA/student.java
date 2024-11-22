import java.util.List;

public class student {
    private String id;
    private String name;
    private String age;
    private double gpa;
    private List<Double> grades;

    public student(String id, String name, String age, double gpa, List<Double> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.grades = grades;
    }

    public List<Double> getGrades(){
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
