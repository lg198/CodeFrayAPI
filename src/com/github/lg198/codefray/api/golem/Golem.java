package com.github.lg198.codefray.api.golem;

import com.github.lg198.codefray.api.game.Direction;
import com.github.lg198.codefray.api.game.Game;
import com.github.lg198.codefray.api.game.Team;
import com.github.lg198.codefray.api.math.Point;

import java.util.List;

public interface Golem {

    public Game getGame();

    public GolemType getType();
    public int getId();
    public Point getLocation();
    public Team getTeam();
    public boolean hasFlag();
    public int getHealth();

    public List<GolemInfo> search();

    public void move(Direction d);
    public int getMovesLeft();

    public void shoot(GolemInfo gi);
    public int getShotsLeft();
}
