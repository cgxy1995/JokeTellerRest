package com.kamijou.JokeTellerRest.services;

import com.kamijou.JokeTellerRest.entities.DotaMatch;

/**
 * Created by njiang on 3/16/2018.
 */
public interface DotaService {
    public DotaMatch getDotaMatch(String gameId);
}
