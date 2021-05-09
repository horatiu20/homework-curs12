package ro.fasttrackit.homework.exercise1;

/*1) create a map with key student(string) and value the grade. Print all students and their grades.
Find the student with the highest grade*/

import java.util.List;

public class Main {
	public static void main(String[] args) {
		SchoolClassroom classroom = new SchoolClassroom(List.of(
				new Classroom(Students.MARIA, 10),
				new Classroom(Students.BOGDAN, 4),
				new Classroom(Students.BIANCA, 8),
				new Classroom(Students.VIRGIL, 7),
				new Classroom(Students.IOAN, 5)
		));

		System.out.println("All students: " + classroom.getStudents());
		System.out.println("Student with highest grade: " + classroom.getMaxGrade());
	}
}
