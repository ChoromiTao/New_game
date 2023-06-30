package org.example.Units.Subclasses.Class_Attack;

import org.example.Interfaces.UnitsTypes;
import org.example.Units.General_class.General_class_Attack;
import org.example.Units.Main_Classes.Unit;

public abstract class Magic_attack extends General_class_Attack {
    private int mana;
    public int baseSpell;

    private static final int MANACONC = 20;

    public Magic_attack(UnitsTypes type, String name) {
        super(type, name);
        mana = 100;
        baseSpell = 15;
    }

    @Override
    public void concentration() {
        super.concentration();
        if (mana + MANACONC < 100) {
            mana += MANACONC;
        } else {
            mana = 100;
        }
    }

    @Override
    public void performAnAttack(Unit unit) {
        if (mana - baseSpell > 0) {
            super.performAnAttack(unit);
            mana -= baseSpell;
        }

    }
}
