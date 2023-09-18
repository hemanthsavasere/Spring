package com.example.springconstructorinjection.model;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach() {
        System.out.println("In constructor " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }
}
