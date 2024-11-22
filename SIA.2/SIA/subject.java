public class subject {

    private String studentName;
    private double gpa;
    private double grade1, grade2, grade3, grade4, grade5;
    private String matter;

    public subject(String studentName, double gpa, double grade1, double grade2, double grade3, double grade4, double grade5,
            String matter) {
        this.studentName = studentName;
        this.gpa = gpa;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
        this.matter = matter;
    }    
    public subject() {
        this.studentName = "";
        this.gpa = 0;
        this.grade1 = 0;
        this.grade2 = 0;
        this.grade3 = 0;
        this.grade4 = 0;
        this.grade5 = 0;
        this.matter = "";
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGrade1() {
        return grade1;
    }
    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }
    public double getGrade2() {
        return grade2;
    }
    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }
    public double getGrade3() {
        return grade3;
    }
    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }
    public double getGrade4() {
        return grade4;
    }
    public void setGrade4(double grade4) {
        this.grade4 = grade4;
    }
    public double getGrade5() {
        return grade5;
    }
    public void setGrade5(double grade5) {
        this.grade5 = grade5;
    }
    public String getMatter() {
        return matter;
    }
    public void setMatter(String matter) {
        this.matter = matter;
    }
    
  
    public double calculateGetGpa(double grade1 , double grade2 , double grade3 , double grade4 , double grade5) {
        double finalgrade;
        finalgrade = (grade1 * 15 + grade2 * 10 + grade3 * 25 + grade4 * 25 + grade5 * 25) / 100; //15 10 25 25 25

        return finalgrade;
    }    
    
}