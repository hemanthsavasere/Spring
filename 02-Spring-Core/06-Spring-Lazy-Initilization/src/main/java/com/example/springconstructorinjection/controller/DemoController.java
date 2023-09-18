package com.example.springconstructorinjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springconstructorinjection.model.Coach;

@RestController
public class DemoController {

    // define a private field for dependency
    private final Coach myCoach;
    private final Coach otherCoach;

    // define a constructor for dependency injection
    public DemoController(@Qualifier("cricketCoach") Coach myCoach, @Qualifier("cricketCoach") Coach otherCoach) {
        System.out.println("In constructor " + getClass().getName());
        this.otherCoach = otherCoach;
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing Beans: myCoach == otherCoach " + (myCoach == otherCoach);
    }

}
