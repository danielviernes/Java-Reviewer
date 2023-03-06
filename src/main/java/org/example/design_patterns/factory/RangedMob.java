package org.example.design_patterns.factory;

public abstract class RangedMob implements Mob{

    protected String name;
    protected Integer baseHealth = 200;
    protected Float baseDamage = 30f;
    protected Float skillMultiplier = 1.75f;

    RangedMob(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.printf("%s attacked for %f damage!\n", name, baseDamage);
    }

    @Override
    public void useSkill() {
        System.out.printf("%s used Barrage for %f damage!\n", name, baseDamage * skillMultiplier);
    }

    @Override
    public void die() {
        System.out.printf("%s: NOOOOOOO!\n", name, baseDamage * skillMultiplier);
    }
}
