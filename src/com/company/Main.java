package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Student obj = new Student();
	obj.Enroll();
	obj.PayTut();
	System.out.println(obj.ShowInfo());

	//New Students to be added
	System.out.println("Enter number of students you want to add");
	Scanner in = new Scanner(System.in);
	int numOfStud = in.nextInt();
	Student[] students = new Student[numOfStud];


    }
}
