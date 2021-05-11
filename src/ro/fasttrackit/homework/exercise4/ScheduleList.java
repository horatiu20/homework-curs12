package ro.fasttrackit.homework.exercise4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ScheduleList   {
	private final List<Schedule> activities = new ArrayList<>();

	public ScheduleList(Collection<Schedule> activities) {
		this.activities.addAll(activities);
	}

	public List<Schedule> getActivities() {
		return activities;
	}

}