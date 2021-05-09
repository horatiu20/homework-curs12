package ro.fasttrackit.homework.exercise2;

import java.util.*;

public class PersonType {
	private final List<Person> persons = new ArrayList<>();

	public PersonType(Collection<Person> persons) {
		this.persons.addAll(persons);
	}

	public List<PersonList> getPersons() {
		List<PersonList> result = new ArrayList<>();
		for (Person all : persons) {
			result.add(all.getName());
		}
		return result;
	}

	public Map<PersonList, Integer> mapNameToAge() {
		Map<PersonList, Integer> result = new HashMap<>();
		for (Person person : persons) {
			result.put(person.getName(), person.getAge());
		}
		return result;
	}

	public List<PersonList> mapOlderThan(int age) {
		List<PersonList> result = new ArrayList<>();
		for (Person person : persons) {
			if (person.getAge() > age) {
				result.add(person.getName());
			}
		}
		return result;
	}

	public Map<String, List<Person>> mapColourToName() {
		Map<String, List<Person>> result = new HashMap<>();
		for (Person person : persons) {
			List<Person> existingList = result.get(person.getHairColour());
			if (existingList == null) {
				existingList = new ArrayList<>();
			}
			existingList.add(person);
			result.put(person.getHairColour(), existingList);
		}
		return result;
	}

	public Map<Integer, List<Person>> mapAgeToPerson() {
		Map<Integer, List<Person>> result = new HashMap<>();
		for (Person person : persons) {
			List<Person> existingList = result.get(person.getAge());
			if (existingList == null) {
				existingList = new ArrayList<>();
			}
			existingList.add(person);
			result.put(person.getAge(), existingList);
		}
		return result;
	}

}
