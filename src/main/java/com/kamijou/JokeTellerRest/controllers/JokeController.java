package com.kamijou.JokeTellerRest.controllers;

import com.kamijou.JokeTellerRest.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by njiang on 2/9/2018.
 */
@RestController
public class JokeController {
    @Autowired
    JokeService jokeService;
    @RequestMapping("/randomJoke")
    public String getRandomJoke(){
        System.out.println("getRandomJoke called");
        return jokeService.tellRandomJoke();
    }
}
