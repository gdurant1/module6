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
                   String major, String degree, Year expectedGraduation){
        super(firstName, middleName, lastName, dateOfBirth);//passes names and date of birth to person constructor.
        this.studentId = nextStudentId;
        this.major = major;
        this.degree = degree;
        this.gpa = 0.0;
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

    ArrayList<Double> gradePoints = new ArrayList<Double>();
    private double inputGpa(){
        //get gpa
        Scanner reader = new Scanner(System.in);
        int classNum = 1;
        boolean stopInput = false;

        do{ //loop to gather grades
            System.out.print("Enter Grade for Class "+ classNum + " : ");
            String grades = reader.next();
            //if-else loop for break
            if(grades.equalsIgnoreCase("EXIT")){stopInput=true;}
            else {
                //change letter grades to points
                if (grades.equalsIgnoreCase("A")) {
                    gradePoints.add(4.0); }
                else if (grades.equalsIgnoreCase("A-")) {
                    gradePoints.add(3.67); }
                else if (grades.equalsIgnoreCase("B+")) {
                    gradePoints.add(3.33); }
                else if (grades.equalsIgnoreCase("B")) {
                    gradePoints.add(3.0); }
                else if (grades.equalsIgnoreCase("B-")) {
                    gradePoints.add(3.67);}
                else if (grades.equalsIgnoreCase("C+")) {
                    gradePoints.add(2.33); }
                else if (grades.equalsIgnoreCase("C")) {
                    gradePoints.add(2.0); }
                else if (grades.equalsIgnoreCase("D")) {
                    gradePoints.add(1.0);}
                else {
                    gradePoints.add(0.0); }
                classNum++;
            }
        } while (!stopInput);

            double sum = 0.0;
            //if no grades
            if (gradePoints == null || gradePoints.isEmpty()) {
                return 0.0;
            }
            for (int i = 0; i < gradePoints.size(); i++) {
                sum += gradePoints.get(i);
            }
            double gpa = sum / gradePoints.size();
            return gpa;
        }
}
