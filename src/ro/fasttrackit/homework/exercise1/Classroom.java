package ro.fasttrackit.homework.exercise1;

import java.util.Objects;

public class Classroom {
	private final Students student;
	private final int grade;

	public Classroom(Students student, int grade) {
		this.student = student;
		this.grade = grade;
	}

	public Students getStudent() {
		return student;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Classroom classroom = (Classroom) o;
		return grade == classroom.grade && student == classroom.student;
	}

	@Override
	public int hashCode() {
		return Objects.hash(student, grade);
	}

	@Override
	public String toString() {
		return "Classroom{" +
				"student=" + student +
				", grade=" + grade +
				'}';
	}
}