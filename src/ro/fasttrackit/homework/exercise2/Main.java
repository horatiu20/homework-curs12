package ro.fasttrackit.homework.exercise2;

/*2. you have a list of Person: Person(name, age, hair colour).
a) extract the list of person names
b) create a map from person's name to their age
c) extract the persons that are older than a given age
d) extract a map from person's hair colour to their name (String->List<String>)
e) create a map from age to list of persons*/

import java.util.List;

public class Main {
	public static void main(String[] args) {
		PersonType personType = new PersonType(List.of(
				new Person(PersonList.MARIA, 30, "blonde"),
				new Person(PersonList.BOGDAN, 16, "brown"),
				new Person(PersonList.BIANCA, 27, "blonde"),
				new Person(PersonList.VIRGIL, 45, "red"),
				new Person(PersonList.IOAN, 66, "grey")
		));

		System.out.println("All students: " + personType.getPersons());
		System.out.println("Name to Age: " + personType.mapNameToAge());
		System.out.println("Persons older than: " + personType.mapOlderThan(35));
		System.out.println("Group by hair colour: " + personType.mapColourToName());
		System.out.println("Age to Person: " + personType.mapAgeToPerson());
	}
}
