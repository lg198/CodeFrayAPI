package com.github.lg198.codefray.api.golem;

import com.github.lg198.codefray.api.game.Team;
import com.github.lg198.codefray.api.math.Point;

public interface GolemInfo {

    public GolemType getType();
    public int getId();
    public Point getLocation();
    public Team getTeam();
    public Team getHeldFlag();
    public boolean isHoldingFlag();
    public int getHealth();
}
