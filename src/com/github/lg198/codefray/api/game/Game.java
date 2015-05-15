package com.github.lg198.codefray.api.game;

import com.github.lg198.codefray.api.math.Direction;
import com.github.lg198.codefray.api.math.Point;

public interface Game {

    public boolean isHoldingFlag(Team t);
    public boolean flagIsHeld(Team t);
    public Point getFlagLocation(Team t);
    public Point getWinLocation(Team t);
    public long getRound();
    public Team[] getTeams();
}
