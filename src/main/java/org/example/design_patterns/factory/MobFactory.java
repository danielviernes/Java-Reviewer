package org.example.design_patterns.factory;

public class MobFactory {

    public static final String WARRIOR = "WARRIOR";
    public static final String ARCHER = "ARCHER";
    public static final String MAGE = "MAGE";


    public static Mob createMob(MobEnums mobType, String name) {

        switch(mobType) {
            case WARRIOR: return new Warrior(name);
            case ARCHER: return new Archer(name);
            case MAGE: return new Mage(name);
            default: throw new IllegalArgumentException("Mob Type does not exist");
        }

    }

}
