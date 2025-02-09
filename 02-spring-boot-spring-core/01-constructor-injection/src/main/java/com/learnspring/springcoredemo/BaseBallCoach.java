package com.learnspring.springcoredemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("BaseBallCoach")
public class BaseBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Base Ball Coach";
    }
}
