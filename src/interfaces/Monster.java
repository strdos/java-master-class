package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(String.valueOf(hitPoints));
        list.add(String.valueOf(strength));
        return list;
    }

    public void read(List<String> list) {
        if (list != null && !list.isEmpty()) {

            name = (list.get(0));
            hitPoints = Integer.parseInt(list.get(1));
            strength = Integer.parseInt(list.get(2));
        }
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Monster{name='%s', hitPoints=%d, strength=%d}".formatted(name, hitPoints, strength);
    }
}
