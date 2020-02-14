
import java.util.Scanner;
import java.util.InputMismatchException;
public class student_main
{
    public static void main(String[] args) throws Exception {
       /* student khaled = new student(82,"Khaled",28,"Informatik",1.4f);
        student Mohadad = new student("Mohamad");
        student Yasin = new student();

        Yasin.setId(131);

        khaled.Print_Info_student();
        Mohadad.Print_Info_student();
        Yasin.Print_Info_student();
         */

       Scanner input = new Scanner (System.in);
       student khaled = new student();

        try {
            System.out.println(" Please Enter your GPA : ");
            khaled.setGpa(input.nextFloat());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            khaled.setGpa(input.nextFloat());
        }

        try {

           System.out.println(" Please Enter your ID numaer : ");
           khaled.setId(input.nextInt());

           System.out.println(" Please Enter your Age : ");
           khaled.setAge(input.nextInt());

           System.out.println("Please Enter your Name : ");
           khaled.setName(input.next());

           System.out.println("Please Enter your ID Deapartment : ");
           khaled.setDepartment(input.next());

            khaled.Print_Info_student();
       }
       catch (InputMismatchException ex)
       {
           System.out.println("ERROR InputMismatch");
       }
    }


}
