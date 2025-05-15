package studentdatabaseapp;

import java.sql.SQLOutput;
import java.util.*;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeyear;
    private String  studentID;
    private String courses;
    private int  tuitionBalance=0;
    private static int costofcourse=600;
    private static int ID=1000;

    // constructor:prompt user to enter student name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student first name ");
        this.firstname=sc.nextLine();
        System.out.println("Enter student last name ");
        this.lastname=sc.nextLine();
        System.out.println("1 - freshmen \n2 - sophmore \n3 - junior \n4 - senior \nEnter student class level ");
        this.gradeyear=sc.nextInt();
        setstudentID();
//        System.out.println( firstname + " " + lastname + " " + gradeyear + " " + studentID);

    }
    //generate and id
    private void setstudentID(){
        ID++;
        this.studentID = gradeyear+  "" + ID;
    }
    //course enroll
    public void enroll(){
        do{
         System.out.println("enter course to enroll(Q to quit)");
         Scanner sc = new Scanner(System.in);
         String course=sc.nextLine();
         if(!course.equals("Q")) {
             courses = courses + "\n " + course;
             tuitionBalance = tuitionBalance + costofcourse;
         }
         else{
             System.out.println("BREAK!");
             break;
         }
         }while (1 != 0);
         System.out.println("enrolled in" + courses );
//         System.out.println("tuition Balance" + tuitionBalance);
    }
    //view balance
    public  void viewbalance(){
        System.out.println("your balance is: $" + tuitionBalance);
    }
    //pay tuition
    public void paytuition(){
        viewbalance();
        System.out.println("enter your payment :$");
        Scanner in =new Scanner(System.in);
                int payment=in.nextInt();
        tuitionBalance= tuitionBalance-payment;
        System.out.println("Thank you for the payment");
        viewbalance();
    }
    //show status
    public String toString(){
        return "name" + firstname + " " + lastname
                +"\ngradelevel"+gradeyear
                +"\nStudentID"+studentID
                +"\ncourses" + courses
                + "\nBalance" + tuitionBalance;
    }
}
