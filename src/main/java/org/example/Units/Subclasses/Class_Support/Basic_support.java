package org.example.Units.Subclasses.Class_Support;

import org.example.Interfaces.UnitsTypes;
import org.example.Units.General_class.General_class_Support;
import org.example.Units.Main_Classes.Unit;

public abstract class Basic_support extends General_class_Support {
    public Basic_support(UnitsTypes type, String name) {
        super(type, name);
    }

    public void putUpABarrier(Unit unit) {
        unit.decreaseAttack(5);
    }
}
