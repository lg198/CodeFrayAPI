package com.github.lg198.codefray.api.game;

import com.github.lg198.codefray.api.math.Direction;
import com.github.lg198.codefray.api.math.Point;

public interface Game {

    /**
     * Checks to see if one of the specified team's golems is holding another team's flag.
     * @param t The team to check
     * @return Whether the team is holding a flag
     */
    public boolean isHoldingFlag(Team t);

    /**
     * Checks to see if the specified team's flag is held by another team.
     * @param t The team that owns the flag
     * @return Whether the team's flag is held
     */
    public boolean flagIsHeld(Team t);

    /**
     * Returns the current location of the specified team's flag
     * @param t The team
     * @return The location of the flag
     */
    public Point getFlagLocation(Team t);

    /**
     * Returns the win location of the specified team
     * @param t The team
     * @return The win location
     */
    public Point getWinLocation(Team t);

    /**
     *
     * @return The current round number
     */
    public long getRound();

    /**
     *
     * @return An array of the teams in the game
     */
    public Team[] getTeams();

    /**
     *
     * @param p The point at which to search
     * @return The type of tile at point p
     */
    public TileType getTypeAt(Point p);

    public int getMapWidth();

    public int getMapHeight();
}
