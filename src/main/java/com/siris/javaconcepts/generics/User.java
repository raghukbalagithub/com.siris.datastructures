package com.siris.javaconcepts.generics;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    public int compareTo(User o) {
        return points - o.points;
    }

    @Override
    public String toString() {
        return "Points = " + points;
    }
}
