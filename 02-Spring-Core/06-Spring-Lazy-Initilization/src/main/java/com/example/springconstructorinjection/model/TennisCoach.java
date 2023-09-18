package com.example.springconstructorinjection.model;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("In constructor " + this.getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
