package com.learnspring.springcoredemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Component annotation marks the class as a spring bean and automatically register the beans in the spring container
// makes it available for the dependency injection
@Component
//@Qualifier("CricketCoach")
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min";
    }
}
