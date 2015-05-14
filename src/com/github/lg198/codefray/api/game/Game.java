package com.github.lg198.codefray.api.game;

import com.github.lg198.codefray.api.math.Point;

public interface Game {

    public boolean isHoldingFlag(Team t);
    public Point getFlagLocation(Team t);
    public Direction getFlagDirection(Team t);
    public long getRound();
}
