package com.synechron.gradeaveragedemo.students;

import java.util.Scanner;

public class Student {
	
	String name;
	String subject;
	String subjectNo;
	String topStudent;
	String chosenSubject;

	static int grade;
	static double topGrade;
	static double average;
	static double classAverage;
	
	int numberOfSubjects;
	int numberOfStudents;

	
	void inputStudentInfo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of class subjects: ");
		numberOfSubjects = sc.nextInt();
		
		System.out.println("-----------------------------------------");
		
		String subjectsArray[] = new String[numberOfSubjects];
		
		for (int j = 0; j < numberOfSubjects; j++) {
			System.out.println("Name of Subject " + (j + 1) + ":");
			subjectsArray[j] = sc.next();
		}
		
		System.out.println("-----------------------------------------");
		

		System.out.println("Number of students: ");
		numberOfStudents = sc.nextInt();
		
		String studentsArray[] = new String[numberOfStudents];
		
		for (int j = 0; j < numberOfStudents; j++) {
			System.out.println("-----------------------------------------");
			System.out.println("Name of Student " + (j + 1) + ":");
			studentsArray[j] = sc.next();
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter info for each student ");
		
		for (int x = 0; x < studentsArray.length; x++) {
			System.out.println("-----------------------------------------");
			System.out.println("Enter info for: " + studentsArray[x]);
			System.out.println("-----------------------------------------");
			
			System.out.println("Choose one of these subjects:  ");
			
			for (int p = 0;  p < subjectsArray.length; p++) {
				System.out.println(" - " + subjectsArray[p]);
			}
			subjectNo = sc.next();
			
			System.out.println("-----------------------------------------");
			
			for (int j = 0; j < subjectsArray.length; j++) {
				if (subjectNo.equals(subjectsArray[j])) {
					chosenSubject = subjectsArray[j];
				} 
			}
			System.out.println("What is " + studentsArray[x] + "'s grade in " + subjectNo + ": ");
//			grade = sc.nextInt();
//			
//			if (grade > 100) {
//				throw new ArithmeticException("The grade cannot exceed 100");
//			} else {
//				System.out.println("-----------------------------------------");
//				System.out.println("Student: " + studentsArray[x] + ", Grade: " + grade);
//			}
			
	        try
	        {
	        	grade = sc.nextInt();
	        	if (grade > 100) {
	                System.out.println("** The grade cannot exceed 100 **");
	        		System.out.println("What is " + studentsArray[x] + "'s grade in " + subjectNo + ": ");
	        		grade = sc.nextInt();
	        	} else {
	        		System.out.println("Student: " + studentsArray[x] + ", Grade: " + grade);
	        	}
	        }
	        catch (ArithmeticException ex)
	        {
	            System.out.println(ex);
	        }

			
			average = (average + grade);
			if (grade > topGrade) {
				topGrade = grade;
				topStudent = studentsArray[x];
			}
		}
		
		classAverage = average / studentsArray.length;
		
		System.out.println("-----------------------------------------");
		System.out.println("--> The Class Average Is: " + classAverage + "%");
		System.out.println("-----------------------------------------");
		System.out.println("--> The Top Student Is: " + topStudent + ", with a grade of " + topGrade + "%");
		System.out.println("-----------------------------------------");
		
		sc.close();
		
	}

}




//package com.synechron.gradeaveragedemo.students;
//
//import java.util.Scanner;
//
//public class Student {
//	
//	String name;
//	String subject;
//	String subjectNo;
//	String topStudent;
//
//	static int grade1;
//	static int grade2;
//	static int grade3;
//	static int topGrade;
//	static int studentAverage;
//	static int average;
//	static int classAverage;
//	
//	int numberOfSubjects;
//	int numberOfStudents;
//
//	
//	void inputStudentInfo() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("How many subjects in the class: ");
//		numberOfSubjects = sc.nextInt();
//		
//		String subjectsArray[] = new String[numberOfSubjects];
//		
//		for (int j = 0; j < numberOfSubjects; j++) {
//			System.out.println("Enter the name of a subject: ");
//			subjectsArray[j] = sc.next();
//		}
//		
//		for (int x = 0; x < subjectsArray.length; x++) {
//			System.out.println(" - " + subjectsArray[x]);
//		}
//		System.out.println("Choose one of these subjects: ");
//		subjectNo = sc.next();
//		
//		for (int j = 0; j < subjectsArray.length; j++) {
//			if (subjectNo.equals(subjectsArray[j])) {
//				System.out.println("You Chose this Subject: " + subjectsArray[j]);
//			} 
//		}
//		
//
//		System.out.println("How many students are in the class: ");
//		numberOfStudents = sc.nextInt();
//		
//		String studentsArray[] = new String[numberOfStudents];
//		
//		for (int j = 0; j < numberOfStudents; j++) {
//			System.out.println("Enter the name of a student: ");
//			studentsArray[j] = sc.next();
//		}
//		
//		System.out.println("Enter the grades for each student: ");
//		
//		for (int x = 0; x < studentsArray.length; x++) {
//			System.out.println(studentsArray[x] + "'s grade 1: ");
//			grade1 = sc.nextInt();
//			System.out.println(studentsArray[x] + "'s grade 2: ");
//			grade2 = sc.nextInt();
//			System.out.println(studentsArray[x] + "'s grade 3: ");
//			grade3 = sc.nextInt();
//			studentAverage = ((grade1 + grade2 + grade3) / 3);
//			average = (average + studentAverage);
//			if (studentAverage > topGrade) {
//				topGrade = studentAverage;
//				topStudent = studentsArray[x];
//			}
//		}
//		
//		classAverage = average / studentsArray.length;
//		
//		System.out.println("Class Average: " + classAverage);
//		System.out.println("Top Student: " + topStudent + ", Grade Average: " + topGrade);
//		
//		sc.close();
//		
//	}
//
//}
