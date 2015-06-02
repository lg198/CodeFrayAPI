package com.github.lg198.codefray.api.math;

/**
 * Represents a two-dimensional point (x, y) of a tile on the map.
 */
public class Point {

    private int x,y;

    /**
     * Creates a two-dimensional point.
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Translates the point by the specified x and y vectors.
     * @param xd The horizontal translation
     * @param yd The vertical translation
     * @return The translated point.
     */
    public Point translate(int xd, int yd) {
        return new Point(x + xd, y + yd);
    }

    public Point in(Direction d) {
        return new Point(x + d.getXChange(), y + d.getYChange());
    }

    public Point in(Direction d, int am) {
        return new Point(x + d.getXChange()*am, y + d.getYChange()*am);
    }

    public boolean inBounds(int xmin, int xmax, int ymin, int ymax) {
        return x >= xmin && x < xmax && y >= ymin && y < ymax;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Point)) {
            return false;
        }
        Point p = (Point) o;
        return p.getX() == getX() && p.getY() == getY();
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
