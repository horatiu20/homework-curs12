package ro.fasttrackit.homework.exercise1;

import java.util.*;

public class SchoolClassroom {
	private final List<Classroom> students = new ArrayList<>();

	public SchoolClassroom(Collection<Classroom> students) {
		this.students.addAll(students);
	}

	public List<Classroom> getStudents() {
		return students;
	}

	public Classroom getMaxGrade() {
		Classroom max = null;
		for (Classroom classroom : students) {
			if (max == null || classroom.getGrade() > max.getGrade()) {
				max = classroom;
			}
		}
		return max;
	}
}
