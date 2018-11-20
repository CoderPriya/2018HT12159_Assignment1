package com.priyaranjan.sszg519.assignment.question8;

import java.util.Set;

public class TrainSchedulingMain {
	public static void main(String[] args) {
		TrainScheduling scheduling = new TrainScheduling();
		Schedule train1 =  new Schedule("RailA", 900, 930);
		scheduling.dataEntry(train1);
		Schedule train2 =  new Schedule("RailB", 915, 1300);
		scheduling.dataEntry(train2);
		Schedule train3 =  new Schedule("RailC", 1030, 1100);
		scheduling.dataEntry(train3);
		Schedule train4 =  new Schedule("RailD", 1045, 1145);
		scheduling.dataEntry(train4);
        System.out.println("Schedule Entered : "+scheduling.schedules);
       /* Set<Schedule> optiSchedule = scheduling.getTheOptimalSchedule();
        System.out.println(optiSchedule);*/
        int platformNeeded = scheduling.getTheOptimalPlatForms();
        System.out.println("Optimal Platform needed :"+platformNeeded);
	}
}
