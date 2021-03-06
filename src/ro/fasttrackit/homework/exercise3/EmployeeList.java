package ro.fasttrackit.homework.exercise3;

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

	public Map<String, List<PersonList>> mapPersonToCompany() {
		Map<String, List<PersonList>> result = new HashMap<>();
		for (Employee employee : employees) {
			List<PersonList> existingList = result.get(employee.getCompany());
			if (existingList == null) {
				existingList = new ArrayList<>();
			}
			existingList.add(employee.getName());
			result.put(employee.getCompany(), existingList);
		}
		return result;
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
