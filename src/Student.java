import java.time.Year;
import java.util.Date;
import java.util.ArrayList;

public class Student extends Person{

    ArrayList<Student> grades; //holds grades to calculate gpa
    private static int nextStudentId=1;
    private int studentId;
    protected String major;
    protected String degree;
    protected double gpa;
    protected Year expectedGraduation;
    //basic constructor
    public Student(){
        super();
        this.studentId = nextStudentId;
        this.major = "UnDeclared";
        this.degree = "N/A";
        this.gpa = gpa;
        this.expectedGraduation = null;
        nextStudentId++;
    }

    public Student(String firstName, String middleName, String lastName, Date dateOfBirth,
                   String major, String degree, double gpa, Year expectedGraduation){
        super(firstName, middleName, lastName, dateOfBirth);//passes names and date of birth to person constructor.
        this.studentId = nextStudentId;
        this.major = major;
        this.degree = degree;
        this.gpa = gpa;
        this.expectedGraduation = expectedGraduation;
        nextStudentId++;
    }

    public int getStudentId(){ return studentId; }
    public String getMajor(){ return major; }
    public String getDegree(){ return degree; }
    double getGpa(){ return gpa; }
    public Year getExpectedGraduation(){return expectedGraduation; }

    public void setMajor(String major){
        this.major = major; }
    public void setDegree(String degree){
        this.degree = degree; }

    private void setGpa(double gpa){
        this.gpa = gpa; }

    public void setExpectedGraduation(Year expectedGraduation){
        this.expectedGraduation = expectedGraduation; }




}
