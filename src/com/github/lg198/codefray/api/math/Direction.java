package com.github.lg198.codefray.api.math;

public enum Direction {

    NORTH(0, -1), SOUTH(0, 1), EAST(1, 0), WEST(-1, 0),
    NORTH_EAST(1, -1), SOUTH_EAST(1, 1), SOUTH_WEST(-1, 1), NORTH_WEST(-1, -1);

    private Direction(int x, int y) {
        xc = x;
        yc = y;
    }

    private int xc, yc;

    public int getXChange() {
        return xc;
    }

    public int getYChange() {
        return yc;
    }


    public static Direction between(Point p1, Point p2) {
        Vector v = Vector.between(p1, p2);
        int xc = v.getXComponent() / Math.abs(v.getXComponent()), yc = v.getYComponent() / Math.abs(v.getYComponent());
        Direction d = null;
        for (Direction dd : values()) {
            if (dd.getXChange() == xc && dd.getYChange() == yc) {
                d = dd;
                break;
            }
        }
        return d;
    }
}

