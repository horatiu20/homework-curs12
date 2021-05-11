package ro.fasttrackit.homework.exercise4;

/*4.
4.1 create an enum for the days of the week
4.2 create an object that represents a Day Schedule. It will have the day (the enum) and a list of activities (Strings)*/

import java.util.List;

public class Main {
	public static void main(String[] args) {
		ScheduleList schedule = new ScheduleList(List.of(
				new Schedule(Day.MONDAY, "coffee", "yes", "yes", "walk in the park", "yes"),
				new Schedule(Day.TUESDAY, "coffee", "yes", "no", "running", "yes"),
				new Schedule(Day.WEDNESDAY, "coffee", "yes", "yes", "watch tv", "yes"),
				new Schedule(Day.THURSDAY, "coffee", "yes", "no", "running", "yes"),
				new Schedule(Day.FRIDAY, "coffee", "yes", "yes", "going out", "no"),
				new Schedule(Day.SATURDAY, "coffee", "no", "no", "playing football", "yes"),
				new Schedule(Day.SUNDAY, "coffee", "no", "no", "couchPotato", "yes")
		));

		System.out.println("Weekday schedule: " + schedule.getActivities());
	}
}