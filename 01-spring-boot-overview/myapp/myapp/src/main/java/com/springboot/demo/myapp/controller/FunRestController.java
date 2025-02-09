package com.springboot.demo.myapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Inject custom properties for : coach.name and team.name - defined in the application.properties file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    //Expose new endpoint for "team info"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName + ", Team: " + teamName;
    }


    // Expose "/" that returns "Hello World"
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }

    // Expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5!";
    }

}
