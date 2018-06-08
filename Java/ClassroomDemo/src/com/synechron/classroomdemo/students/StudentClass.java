package com.synechron.classroomdemo.students;

public class StudentClass {
	static int numberOfStudents = 0;
	
	void addStudent() {
		numberOfStudents++;
	}

	public static void main(String[] args) {
		StudentClass student1 = new StudentClass();
		student1.addStudent();
		
		StudentClass student2 = new StudentClass();
		student2.addStudent();
		
		StudentClass student3 = new StudentClass();
		student3.addStudent();
		
		System.out.println("Current Number of Students: " + numberOfStudents);

	}

}
