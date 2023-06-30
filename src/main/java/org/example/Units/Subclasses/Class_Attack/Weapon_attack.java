package org.example.Units.Subclasses.Class_Attack;

import org.example.Interfaces.UnitsTypes;
import org.example.Units.General_class.General_class_Attack;
import org.example.Units.Main_Classes.Unit;

public abstract class Weapon_attack extends General_class_Attack {
    private int stamina;
    private static final int STAMINACONC = 20;
    private int baseWeapon;


    public Weapon_attack(UnitsTypes type, String name) {
        super(type, name);
        stamina = 100;
        baseWeapon = 15;
    }

    @Override
    public void performAnAttack(Unit unit) {
        super.performAnAttack(unit);
        // super.decreaseStamina(10);
        if (stamina - baseWeapon > 0) {
            super.performAnAttack(unit);
            stamina -= baseWeapon;
        }
    }

    @Override
    public void concentration() {
        super.concentration();
        if (stamina + STAMINACONC < 100) {
            stamina += STAMINACONC;
        } else {
            stamina = 100;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void addStamina(int value) {
        stamina += value;
    }

    public void decreaseStamina(int value) {
        stamina -= value;
    }
}
