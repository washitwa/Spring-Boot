package in.placement;

public class JsonJob {
	private String schedule;

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Override
	public String toString() {
		return "JsonJob [schedule=" + schedule + "]";
	}
	
}
