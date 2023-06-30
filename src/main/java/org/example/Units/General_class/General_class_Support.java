package org.example.Units.General_class;

import org.example.Interfaces.UnitsTypes;
import org.example.Units.Main_Classes.Unit;

public abstract class General_class_Support extends Unit {
    private int speed;
    private int pointActivites;

    public General_class_Support(UnitsTypes type, String name) {
        super(type, name);
//        speed = super.getSpeed() * 2;
        pointActivites = super.getPointActivites() * 2;
    }
}
