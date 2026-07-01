import java.time.Year;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{
    
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
        this.gpa = 0.0;
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

    private double calculateGpa(){
        //no gpa
        //get gpa
        ArrayList<Double> gradePoints = new ArrayList<Double>();
        Scanner reader = new Scanner(System.in);
        int classNum = 1;
        boolean stopGpa = false;
        String grades;

        do{ //loop to gather grades

            System.out.print("Enter Grade for Class "+ classNum + " : ");
            grades[i] = reader.nextString();
            If (grades == a || A){ gradePoints[i]= 4.0; }
                else if (grades == a- || A-){gradePoints[i]=3.67;}
                else if (grades== b+ || B+ ) {gradePoints[i]=3.33;}
                else if (grades== b || B ) {gradePoints[i]=3;}
                else if (grades== b- || B- ) {gradePoints[i]=3.67;}
                else if (grades== c+ || C+ ) {gradePoints[i]=2.33;}
                else if (grades== c || C ) {gradePoints[i]=2;}
                else if (grades== d || D ) {gradePoints[i]=1;}
                else {gradePoints[i]=0;}

                classNum++;
        } while (!stopGpa);
        //calculate gpa
        for (int i = 0; i < ArraList.size(); i++ ){}
    }
}
