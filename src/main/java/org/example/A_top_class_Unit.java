package org.example;

public abstract class A_top_class_Unit {
    public int health; //здоровье в поинтах
    public int attac; //атака в поинтах
    public float defend; //защита в поинтах
    public int speed; //скорость в клетках
    public int point_activities; // очки активности - туда вложить действия движения, атаку, защиту
    public int stamina; // физическая выносливость
    public int mana; // выносливость магических существ
    public float precision; // меткость для всех

    public A_top_class_Unit(int health, int attac, float defend, int speed, int point_activities, int stamina, int mana, float precision) {
        this.health = health;
        this.attac = attac;
        this.defend = defend;
        this.speed = speed;
        this.point_activities = point_activities;
        this.stamina = stamina;
        this.mana = mana;
        this.precision = precision;
    }

}
