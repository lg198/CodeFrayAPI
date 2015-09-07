package com.github.lg198.codefray.api.math;

public enum Direction {

    NORTH(0, -1),  EAST(1, 0),
    SOUTH(0, 1),  WEST(-1, 0);

    Direction(int x, int y) {
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

    public Direction clockwise() {
        int next = ordinal() + 1;
        if (next > 7) {
            next = 0;
        }
        return Direction.values()[next];
    }

    public Direction counterClockwise() {
        int next = ordinal() - 1;
        if (next < 0) {
            next = 7;
        }
        return Direction.values()[next];
    }


    public static Direction between(Point p1, Point p2) {
        Vector v = Vector.between(p1, p2);
        int xc = v.getXComponent() == 0 ? 0 : v.getXComponent() / Math.abs(v.getXComponent()), yc = v.getYComponent() == 0 ? 0 : v.getYComponent() / Math.abs(v.getYComponent());
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

