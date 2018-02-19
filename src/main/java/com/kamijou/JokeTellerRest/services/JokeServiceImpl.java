package com.kamijou.JokeTellerRest.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by njiang on 2/9/2018.
 */
@Service
public class JokeServiceImpl extends ChuckNorrisQuotes implements JokeService{
    public String tellRandomJoke() {
        return getRandomQuote();
    }
}
