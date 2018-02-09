package com.kamijou.JokeTellerRest.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by njiang on 2/9/2018.
 */
@Service
public class JokeServiceImpl implements JokeService {
    public String tellRandomJoke() {
        RestTemplate restTemplate = new RestTemplate();
        return "This is a random Joke";
    }
}
