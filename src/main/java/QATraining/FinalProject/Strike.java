package QATraining.FinalProject;

import java.time.LocalDate;

public class Strike {
	
	private LocalDate dateOfStrike;
	private String location;
	private String leader;
	private String tradeUnion;
	private String workArea;
	private int capacity;
	
	private LocalDate getDateOfStrike() {
		return dateOfStrike;
	}
	
	public void setDateOfStrike(LocalDate dateOfStrike) {
		this.dateOfStrike = dateOfStrike;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	
	public String getTradeUnion() {
		return tradeUnion;
	}
	
	public void setTradeUnion(String tradeUnion) {
		this.tradeUnion = tradeUnion;
	}
	
	public String getWorkArea() {
		return workArea;
	}
	
	public void setWorkArea(String workArea) {
		this.workArea = workArea;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
