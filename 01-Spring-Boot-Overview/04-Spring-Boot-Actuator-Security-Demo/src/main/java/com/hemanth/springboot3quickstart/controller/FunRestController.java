package com.hemanth.springboot3quickstart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${team.name}")
    private String teamName;

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String HelloWorld() {
        return "Hello and Welcome to " + appName;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5K ";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach Name : " + coachName + ", Team Name : " + teamName;
    }
}
