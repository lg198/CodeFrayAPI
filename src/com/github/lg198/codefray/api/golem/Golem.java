package com.github.lg198.codefray.api.golem;

import com.github.lg198.codefray.api.math.Direction;
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
    public Team getHeldFlag();
    public boolean isHoldingFlag();
    public int getHealth();

    public List<GolemInfo> search();
    public Direction getFlagDirection(Team t);

    public void move(Direction d);
    public int getMovesLeft();

    public void shoot(GolemInfo gi);
    public int getShotsLeft();

    public boolean isWall(Direction d);
    public boolean isGolem(Direction d);
}
