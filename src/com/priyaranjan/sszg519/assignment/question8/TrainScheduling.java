package com.priyaranjan.sszg519.assignment.question8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TrainScheduling {
	List<Schedule> schedules = new LinkedList<>();
	
	public void dataEntry(Schedule trainSchedule){
		schedules.add(trainSchedule);		
	}
	//Get the optimal Platforms
	public int getTheOptimalPlatForms(){
		int n = schedules.size();
		int optimalPlatForm = 1, platformNeeded =1;		
		int current=1,m=0;
		while(current < n && m < n){
			if(schedules.get(current).arrival < schedules.get(m).departure){
				optimalPlatForm++;
				current++;
				if(optimalPlatForm > platformNeeded ){
					platformNeeded = optimalPlatForm;
				}
			}else{
					optimalPlatForm--;
					m++;		
			}		
		}		
		return platformNeeded;
		
	}

}
