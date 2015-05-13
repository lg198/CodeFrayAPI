package com.github.lg198.codefray.api.math;

/**
 * Represents a two-dimensional vector, broken down into x and y components.
 */
public class Vector {

    private int x,y;
    private double magnitude = Double.NEGATIVE_INFINITY;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getXComponent() {
        return x;
    }

    public int getYComponent() {
        return y;
    }

    /**
     * Returns the vector's magnitude, calculating it if necessary.
     * @return The vector's magnitude
     */
    public double getMagnitude() {
        if (magnitude == Double.NEGATIVE_INFINITY) {
            magnitude = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }
        return magnitude;
    }

    /**
     * Returns the vector's magnitude, squared. This is more efficient than calculating the true magnitude.
     * @return The vector's magnitude, squared
     **/
    public int getMagnitudeSquared() {
        return (int) Math.pow(x, 2) + (int) Math.pow(y, 2);
    }

    /**
     * Adds the specified vectors.
     * @param va An array of vectors
     * @return The resultant vector
     */
    public static Vector add(Vector... va) {
        int sx = 0, sy = 0;
        for (Vector v : va) {
            sx += v.getXComponent();
            sy += v.getYComponent();
        }
        return new Vector(sx, sy);
    }

    /**
     * Finds and returns the vector that exists between two points.
     * @param p1 Starting point
     * @param p2 Ending point
     * @return The vector representing the distance between the two points
     */
    public static Vector between(Point p1, Point p2) {
        return new Vector(p2.getX() - p1.getX(), p2.getY() - p1.getY());
    }
}
