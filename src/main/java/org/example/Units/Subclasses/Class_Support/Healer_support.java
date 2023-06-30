package org.example.Units.Subclasses.Class_Support;

import org.example.Interfaces.UnitsTypes;
import org.example.Units.General_class.General_class_Support;
import org.example.Units.Main_Classes.Unit;

public abstract class Healer_support extends General_class_Support {
    public Healer_support(UnitsTypes type, String name) {
        super(type, name);
    }

    /**
     * лечить
     *
     * @param unit
     */
    public void smallHeal(Unit unit) {
        unit.addHealth(10);
    }
}
