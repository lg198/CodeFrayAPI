package com.github.lg198.codefray.api.golem;

import com.github.lg198.codefray.api.game.TileType;
import com.github.lg198.codefray.api.math.Direction;
import com.github.lg198.codefray.api.game.Game;
import com.github.lg198.codefray.api.game.Team;
import com.github.lg198.codefray.api.math.Point;

import java.util.List;

public interface Golem {

    /**
     *
     * @return The current game
     */
    public Game getGame();

    /**
     *
     * @return The golem's type
     */
    public GolemType getType();

    /**
     *
     * @return The golem's id
     */
    public int getId();

    /**
     *
     * @return The golem's location on the map
     */
    public Point getLocation();

    /**
     *
     * @return The golem's team
     */
    public Team getTeam();

    /**
     *
     * @return The team of the flag the golem is holding, or null if he is not holding a flag
     */
    public Team getHeldFlag();

    /**
     *
     * @return If the golem is holding a flag
     */
    public boolean isHoldingFlag();

    /**
     *
     * @return The health of the golem
     */
    public int getHealth();

    /**
     * Searches a specific area for nearby golems. The area searched is determined by the type of golem.
     * @return A list of the golems within the designated search area.
     */
    public List<GolemInfo> search();

    /**
     * Finds and returns the direction to the flag of the specified team.
     * @param t The team to search
     * @return The direction to the flag of the specified team
     */
    public Direction getFlagDirection(Team t);


    /**
     * Moves the golem in the specified direction by one grid cell.
     * @param d The direction in which to move
     */
    public void move(Direction d);

    /**
     *
     * @return The number of moves left in the current round
     */
    public int getMovesLeft();


    /**
     * Shoots the specified golem once
     * @param gi The GolemInfo of the golem to shoot
     */
    public void shoot(GolemInfo gi);

    /**
     *
     * @return The number of shots left in the current round
     */
    public int getShotsLeft();

    /**
     * Detects the type of tile that is next to the golem in the specified direction. An empty tile is signified by TileType.EMPTY, not null.
     * @param d The direction of the tile
     * @return The type of tile, null if there is no tile (golem is on edge of board)
     */
    public TileType detectTile(Direction d);
}
