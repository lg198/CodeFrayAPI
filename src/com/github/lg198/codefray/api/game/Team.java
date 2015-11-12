package com.github.lg198.codefray.api.game;


public enum Team {
    RED, BLUE;

    public static Team otherTeam(Team t) {
        return t == RED ? BLUE : RED;
    }
}
