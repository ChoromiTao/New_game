package org.example;
import org.example.Units.Main_Classes.Unit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A_Main {
    public static void main(String[] args) {
        List<Unit> team = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = new Random().nextInt(4);
            switch (val) {
                case 0 -> team.add(new Infantries());
                case 1 -> team.add(new Wizards());
                case 2 -> team.add(new Archers());
                case 3 -> team.add(new Peasants());
            }
            System.out.println(team.get(i).getInfo());
    }
}