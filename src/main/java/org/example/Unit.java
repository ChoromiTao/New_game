package org.example;

public abstract class Unit {
    public int health;
    public int attac;
    public int defend;
    public int speed;

    public Unit(int health, int attac, int defend, int speed) {
        this.health = health;
        this.attac = attac;
        this.defend = defend;
        this.speed = speed;
    }
}
