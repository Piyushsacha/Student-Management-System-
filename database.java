package studentdatabaseapp;

import java.util.Scanner;

public class Studentdatabaseapp {
    public static void main(String [] args){

        // how many new user we want to add
        System.out.println("Enter number of student enroll");
        Scanner in=new Scanner(System.in);
        int numofStudent=in.nextInt();
        Student [] students=new Student[numofStudent];
        //  create n no of new student
        for(int i=0;i<numofStudent;i++){
            students[i]=new Student();
            students[i].enroll();
            students[i].paytuition();
            System.out.println(students[i].toString());

        }
    }
}
