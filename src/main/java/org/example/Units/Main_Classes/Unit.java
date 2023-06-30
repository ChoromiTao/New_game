package org.example.Units.Main_Classes;

import org.example.Interfaces.UnitsTypes;
import org.example.Interfaces.mainInterface;

public abstract class Unit implements mainInterface {
    private String name;
    private int health; //здоровье в поинтах
    private int attack; //атака в поинтах
    private int defense; //защита в поинтах
    private int speed; //скорость в клетках
    private int pointActivites; // очки активности - туда вложить действия движения, атаку, защиту
    private int stamina; // физическая выносливость
    private int mana; // выносливость магических существ
    private boolean defended;
    private boolean attacked;


    public Unit(UnitsTypes type, String name) {
        health = 50;
        defense = 2;
        speed = 1;
        pointActivites = 1;
        attack = 5;
        defended = false;
        attacked = false;
        this.name = name;
        this.type = type;
    }
    public void performAnAttack(Unit unit) {
        if (attack - defense > 0) unit.decreaseHealth(attack - defense);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type.toString();
    }

    public void makeAMove() {

    }

    public void skipAMove() {
        pointActivites = 0;
    }

    public void skipActivity() {
        pointActivites -= 1;
    }

    public int getAttack() {
        return attack;
    }

//    public void setAttack(int value) {
//        attack = value;
//    }

//    public void addAttack(int value) {
//        attack += value;
//    }

    public void decreaseAttack(int value) {
        attack -= value;
    }

    public int getPointActivites() {
        return pointActivites;
    }

    public void setPointActivites(int value) {
        pointActivites = value;
    }

    public void addPointActivites(int value) {
        pointActivites += value;
    }

//    public void decreasePointActivites(int value) {
//        health -= value;
//    }

    // рассмотреть удаление
//    public int getHealth() {
//        return health;
//    }

    public void addHealth(int value) {
        health += value;
    }

    public void decreaseHealth(int value) {
        if (health - value > 0) {
            health -= value;
        } else {
            health = 0; // умер
        }
    }

    public int getDefense() {
        return defense;
    }

    public void addDefence(int value) {
        defense += value;
    }

    public void decreaseDefence(int value) {
        defense -= value;
    }

    public int getSpeed() {
        return speed;
    }

    public void addSpeed(int value) {
        defense += value;
    }

    public void decreaseSpeed(int value) {
        defense -= value;
    }

    public String getUnitBaseInfo() {
        return "Тип: " + type.toString() + " Имя: " + name + " Здоровье: " + health + " Атака: " + attack;
    }

    @Override
    public String toString() {
        return getUnitBaseInfo();
    }

    @Override
    public String getInfo() {
        return this.toString();
    }

    @Override
    public void step() {

    }
}
