import creatures.*;

import java.util.ArrayList;
import java.util.List;

public class SeaCreatureRunner {
    public static void main(String[] args) {
        SeaCreature[] creatures = {
                new Squid(),
                new Whale(),
                new SeaCreature(),
                new AquaticMammal(),
                new seaOtters(),
        };

        List<String> list = new ArrayList<>();
        for (SeaCreature creature : creatures) {
            System.out.println(creature);
            creature.method1();
            creature.method2();
            System.out.println();
        }
    }
}