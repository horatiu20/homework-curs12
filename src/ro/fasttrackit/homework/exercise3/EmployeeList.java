package ro.fasttrackit.homework.exercise3;

/*3. The Employee is an object that extends Person and adds two fields: company and salary.
     Have a list of Employees
a) extract persons that have salaries more than a specified amount
b) extract a Map that gathers all the persons for a company
c) calculate the sum of all salaries for all employees
d) calculate which company gives the biggest salary*/

import ro.fasttrackit.homework.exercise2.PersonList;

import java.util.*;

public class EmployeeList {
	private final List<Employee> employees = new ArrayList<>();

	public EmployeeList(Collection<Employee> employees) {
		this.employees.addAll(employees);
	}

	public List<PersonList> mapSalary(int salary) {
		List<PersonList> result = new ArrayList<>();
		for (Employee employee : employees) {
			if (employee.getSalary() >= salary) {
				result.add(employee.getName());
			}
		}
		return result;
	}

	public Map<String, List<Employee>> mapPersonToCompany() {
		Map<String, List<Employee>> result = new HashMap<>();
		for (Employee employee : employees) {
			List<Employee> existingList = result.get(employee.getCompany());
			if (existingList == null) {
				existingList = new ArrayList<>();
			}
			existingList.add(employee);
			result.put(employee.getCompany(), existingList);
		}
		return result;       // nu inteleg de ce nu imi scoate Employee, doar compania si salariul
	}

	public int getSumOfSalaries() {
		List<Integer> result = new ArrayList<>();
		int sum = 0;
		for (Employee all : employees) {
			result.add(all.getSalary());
			sum += all.getSalary();
		}
		return sum;
	}

//	public Map<String, Integer> getMaxSalary() {
//		Map<String, Integer> result = new HashMap<>();
//		int max = 0;
//		for (Employee employee : employees) {
//
//		}
//	}
}
