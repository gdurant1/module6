import java.time.Year;
import java.util.Date;

public class Student extends Person{
    private static int nextStudentId=1;
    private int studentId;
    protected String major;
    protected String degree;
    protected double gpa;
    protected Year expectedGraduation;

    public Student(){
        super();
        this.studentId = nextStudentId;
        this.major = "UnDeclared";
        this.degree = "N/A";
        this.gpa = gpa;
        this.expectedGraduation = null;
        nextStudentId++;
    }

    public Student(String major, String degree, double gpa, Year expectedGraduation){
        this.studentId = nextStudentId;
        this.major = major;
        this.degree = degree;
        this.gpa = gpa;
        this.expectedGraduation = expectedGraduation;
        nextStudentId++;
    }



}
