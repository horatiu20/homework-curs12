package ro.fasttrackit.homework.exercise4;

import java.util.Objects;

public class Schedule {
	private final Day day;
	private final String eatBreakfast;
	private final String goToWork;
	private final String goToGim;
	private final String relaxing;
	private final String dinnerWithFamily;

	public Schedule(Day day, String eatBreakfast, String goToWork, String goToGim, String relaxing, String dinnerWithFamily) {
		this.day = day;
		this.eatBreakfast = eatBreakfast;
		this.goToWork = goToWork;
		this.goToGim = goToGim;
		this.relaxing = relaxing;
		this.dinnerWithFamily = dinnerWithFamily;
	}

	public Day getDay() {
		return day;
	}

	public String getEatBreakfast() {
		return eatBreakfast;
	}

	public String getGoToWork() {
		return goToWork;
	}

	public String getGoToGim() {
		return goToGim;
	}

	public String getRelaxing() {
		return relaxing;
	}

	public String getDinnerWithFamily() {
		return dinnerWithFamily;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Schedule schedule = (Schedule) o;
		return day == schedule.day && Objects.equals(eatBreakfast, schedule.eatBreakfast) && Objects.equals(goToWork, schedule.goToWork) && Objects.equals(goToGim, schedule.goToGim) && Objects.equals(relaxing, schedule.relaxing) && Objects.equals(dinnerWithFamily, schedule.dinnerWithFamily);
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, eatBreakfast, goToWork, goToGim, relaxing, dinnerWithFamily);
	}

	@Override
	public String toString() {
		return "Schedule{" +
				"day=" + day +
				", eatBreakfast='" + eatBreakfast + '\'' +
				", goToWork='" + goToWork + '\'' +
				", goToGim='" + goToGim + '\'' +
				", relaxing='" + relaxing + '\'' +
				", dinnerWithFamily='" + dinnerWithFamily + '\'' +
				'}';
	}
}