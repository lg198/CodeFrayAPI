package com.github.lg198.codefray.api.golem;

public enum GolemType {

    RUNNER(3, 9, 3, 30, 100), DEFENDER(1, 64, 4, 50, 160), ASSAULT(2, 25, 5, 70, 130);

    private GolemType(int moves, int radius, int shots, int strength, int health) {
        maxMoves = moves;
        maxRadius = radius;
        maxShots = shots;
        maxShotStrength = strength;
        maxHealth = health;
    }

    private int maxMoves, maxRadius, maxShots, maxShotStrength, maxHealth;

    public int getMaxMoves() {
        return maxMoves;
    }
    public int getMaxSearchRadiusSquared() {
        return maxRadius;
    }
    public int getMaxShots() {
        return maxShots;
    }
    public int getMaxShotStrength() {
        return maxShotStrength;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
}
