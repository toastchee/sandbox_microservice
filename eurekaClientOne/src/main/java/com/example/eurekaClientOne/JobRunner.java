package com.example.eurekaClientOne;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobRunner {

	@Scheduled(fixedRate=4000)
	public void doStuff() {
		System.out.println("ClientOne.JobRunner.doStuff()");
	}
}
