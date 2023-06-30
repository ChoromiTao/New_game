package org.example.Units.General_class;

import org.example.Interfaces.UnitsTypes;
import org.example.Units.Main_Classes.Unit;

public abstract class General_class_Attack extends Unit {
    private int abilityPoints;

    public General_class_Attack(UnitsTypes type, String name) {
        super(type, name);
        abilityPoints = 0;

    }

//    @Override
//    public void performAnAttack(Unit unit) {
//
//    }

    public void concentration() {
//        super.decreasePointActivites(1);
        super.skipAMove();
        if (abilityPoints < 3) {
            abilityPoints += 1;
        }
    }

    public int getAbilityPoints() {
        return abilityPoints;
    }
//    public void addAbilityPoints(int value) {
//        abilityPoints += value;
//    }

    public void useAbility() {
        abilityPoints = 0;
    }

}
