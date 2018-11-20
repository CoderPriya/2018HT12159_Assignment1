package com.priyaranjan.sszg519.assignment.question8;

class Schedule{
	String railName;
	int arrival;
	int departure;
	Schedule(String rName, int arrival,int departure){
		this.railName = rName;
		this.arrival = arrival;
		this.departure = departure;
	}
	public String getRailName() {
		return railName;
	}
	public void setRailName(String railName) {
		this.railName = railName;
	}
	public int getArrival() {
		return arrival;
	}
	public void setArrival(int arrival) {
		this.arrival = arrival;
	}
	public int getDeparture() {
		return departure;
	}
	public void setDeparture(int departure) {
		this.departure = departure;
	}
	@Override
	public String toString() {
		
		return "{"+railName+" : Arr("+arrival+") Dept("+departure+")}";
	}
}