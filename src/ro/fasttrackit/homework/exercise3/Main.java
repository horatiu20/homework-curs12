package ro.fasttrackit.homework.exercise3;

import ro.fasttrackit.homework.exercise2.PersonList;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		EmployeeList employeeList = new EmployeeList(List.of(
				new Employee(PersonList.MARIA, 30, "Oracle", 1500),
				new Employee(PersonList.BOGDAN, 16, "Tesla", 1000),
				new Employee(PersonList.BIANCA, 27, "SpaceX", 2000),
				new Employee(PersonList.VIRGIL, 45, "Microsoft", 4000),
				new Employee(PersonList.IOAN, 66, "Microsoft", 2500)
		));

		System.out.println("Persons with salaries more than: " + employeeList.mapSalary(2000));
		System.out.println("Persons for a company: " + employeeList.mapPersonToCompany());
		System.out.println("Total salaries: " + employeeList.getSumOfSalaries());
//		System.out.println("Company with max salary: " + employeeList.getMaxSalary());

	}
}
