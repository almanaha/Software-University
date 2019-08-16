package net.java.main.impl.utilities.models.units;

import net.java.main.impl.utilities.handler.MarineCombatHandler;

public class Marine extends Unit {

    private static final int RANGE = 1;
    private static final int HEALTH_POINTS = 50;
    private static final int ENERGY_POINTS = 80;
    private static final int ATTACK_POINTS = 15;
    private static final int DEFENCE_POINTS = 5;

    public Marine(
            String name,
            Integer xPosition,
            Integer yPosition) {
        super(
                name,
                RANGE,
                xPosition,
                yPosition,
                HEALTH_POINTS,
                ENERGY_POINTS,
                ATTACK_POINTS,
                DEFENCE_POINTS,
                new MarineCombatHandler());
    }
}
