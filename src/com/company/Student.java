package com.company;

import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private String GradeYear;
    private String stuID;
    private String courses = " ";
    private int TutBalance = 0;
    private static int CostOfC = 600;
    public static int id = 1000;

    //constructor: to prompt user
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        this.FirstName = in.nextLine();

        System.out.print("Please enter your Last name: ");
        this.LastName = in.nextLine();

        System.out.println("1 - First Year/Freshman\n2 - Second Year\n3 - Third Year\nPlease Select from the above option");

        this.GradeYear = in.nextLine();
        SetID();


    }
    //generate ID method
    private void SetID() {
    //Grade Level + ID
        id++;
        this.stuID = GradeYear +  id;
    }
    //Course enrollment
    public void Enroll(){
        do {

            System.out.print("Enter course to enrol (Q to quit: )");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q") ) {
                courses = courses + "\n " + course;
                TutBalance = TutBalance + CostOfC;
            }
            else {break;}
        }while (1 != 0);

        System.out.println("Tution Balance: " + TutBalance);
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance due is R" + TutBalance);
    }
    //Payment
    public void PayTut(){
        System.out.print("Please enter your payment");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        TutBalance = TutBalance - payment;
        System.out.println("Thank you for your payment of R" + payment);
        viewBalance();
    }
    public String ShowInfo(){
        return "Name: " + FirstName + " " + LastName +
                "\n Year of Study"+ GradeYear +
                "\n Student ID" + stuID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: R" + TutBalance;
    }

}
