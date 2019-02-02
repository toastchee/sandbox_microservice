package com.example.eurekaClientTwo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobRunner {

	@Scheduled(fixedRate=4000)
	public void doStuff() {
		System.out.println("ClientTwo.JobRunner.doStuff()");
	}
}
