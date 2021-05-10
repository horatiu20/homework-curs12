package ro.fasttrackit.homework.exercise3;

import ro.fasttrackit.homework.exercise2.Person;
import ro.fasttrackit.homework.exercise2.PersonList;

import java.util.Objects;

public class Employee extends Person {
	private final String company;
	private final int salary;

	public Employee(PersonList name, int age, String company, int salary) {
		super(name, age, "notImportant");
		this.company = company;
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Employee employee = (Employee) o;
		return salary == employee.salary && Objects.equals(company, employee.company);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), company, salary);
	}

	@Override
	public String toString() {
		return "Employee{" +
				"company='" + company + '\'' +
				", salary=" + salary +
				'}';
	}
}
