
import java.util.InputMismatchException;
public class student
{
    /*Student ID */
    private int id;
    /*Student Name */
    private String name;
    /*Student Age */
    private int age;
    /*Student Deapartment at the University */
    private String department;
    /*Student GPA  */
    private float gpa;
    /* Abgeschlossner */
    private boolean isGraduated;

    /*
     * Initialization student date
     */
    public student ()
    {
        this.id = 0;
        this.name = "none";
        this.age = 0;
        this.department = "none";
        this.gpa = 0.0f;
        this.isGraduated = false;
    }
    /*
     * Initialization student date
     * Note : (P) stands for parameter
     */
    public student (int pid , String pname , int page , String pdepartment , float pgpa)
    {
        this.id = pid;
        this.name = pname;
        this.age = page;
        this.department = pdepartment;
        this.gpa = pgpa;
        this.isGraduated = false;
    }
    /*
     * Initialization student date
     * Note : (P) stands for parameter
     */
    public student ( String pname )
    {
        this.id = 0;
        this.name = pname;
        this.age = 0;
        this.department = "none";
        this.gpa = 0.0f;
        this.isGraduated = false;
    }
    /*
     * change student ID
     */
    public void setId (int pid)
    {
        this.id = pid;
    }
    /*
     *  Get the current student ID
     */
    public int getId ()
    {
        return this.id;
    }
    /*
     * change student name
     */
    public void setName (String pname)
    {
        this.name = pname;
    }
    /*
     *  Get the current student name
     */
    public String  getName  ()
    {
        return this.name;
    }
    /*
     * change student Age
     */
    public void setAge (int page)
    {
        this.age = page;
    }
    /*
     *  Get the current student Age
     */
    public int getAge ()
    {
        return this.age;
    }
    /*
     * change student Department
     */
    public void setDepartment (String pdepartment)
    {
        this.department = pdepartment;
    }
    /*
     *  Get the current student Department
     */
    public String  getDepartment ()
    {
        return this.department;
    }
    /*
     * change student GPA
     */
    public void setGpa (float pgpa) throws Exception , InputMismatchException
    {
        if (pgpa < 1) {
            System.out.println("ERROR 404");
            throw new Exception ("Pleas Enter Value > 0 : ");
        }

        this.gpa = pgpa;
    }
    /*
     *  Get the current student GPA
     */
    public float getGpa ()
    {
        return this.gpa;
    }
    public boolean isGraduated ()
    {
        return this.isGraduated;
    }

    /*
     * student Information
     */
    public void Print_Info_student ()
    {
        System.out.println("--------------- ( " + this.id + " ) " + this.name + "Information ---------------");
        System.out.println(" Age : " + this.age);
        System.out.println(" Department : " + this.department);
        System.out.println(" GPA : " + this.gpa);
        System.out.println("Graduated :"+ this.isGraduated);
    }


}
