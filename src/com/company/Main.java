package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	//New Students to be added
	System.out.print("Enter number of students you want to enroll: ");
	Scanner in = new Scanner(System.in);
	int numOfStud = in.nextInt();
	Student[] students = new Student[numOfStud];

	//Create n number of new stud
	for(int n =0; n < numOfStud; n++){
		students[n] = new Student();
		students[n].Enroll();
		students[n].PayTut();
		students[n].ShowInfo();
		System.out.println(students[n].toString());

	}

    }
}
