package com.learnspring.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    //define a private field for the dependency
    private Coach coach;

    //define a constructor for dependency injection
    //Behind the scene-Work done by Spring
    //1. Coach coach = new CricketCoach();
    //2. CoachController coachController = new CoachController(coach);
    @Autowired
    public CoachController(@Qualifier("baseBallCoach") Coach coach){
        this.coach=coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
