package com.kamijou.JokeTellerRest.controllers;

import com.kamijou.JokeTellerRest.entities.GameResult;
import com.kamijou.JokeTellerRest.entities.Joke;
import com.kamijou.JokeTellerRest.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by njiang on 2/9/2018.
 */
@RestController
public class JokeController {
    @Autowired
    JokeService jokeService;
    private RestTemplate restTemplate;

    public JokeController() {
        this.restTemplate = new RestTemplate();
    }

    @RequestMapping("/randomJoke")
    public Joke getRandomJoke(){
        System.out.println("getRandomJoke called");
        Joke joke = new Joke();
        joke.setJokeString(jokeService.tellRandomJoke());
        return joke;
    }
    @GetMapping("/dotaMatch/{id}")
    public GameResult getDotaMatch(@PathVariable("id") String id){
        try {
            URI uri = new URI("http://api.steampowered.com/IDOTA2Match_570/GetMatchDetails/V001/?match_id=3779813526&key=CE3CED7F622A884B1A50FE904250D0C3");
            System.out.println("here");
            ResponseEntity<GameResult> gameResultResponseEntity = restTemplate.getForEntity(uri, GameResult.class);
            return gameResultResponseEntity.getBody();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
