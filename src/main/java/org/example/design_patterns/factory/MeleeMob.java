package org.example.design_patterns.factory;

public abstract class MeleeMob implements Mob{

    protected String name;
    protected Integer baseHealth = 300;
    protected Float baseDamage = 20f;
    protected Float skillMultiplier = 1.5f;

    MeleeMob(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.printf("%s attacked for %f damage!\n", name, baseDamage);
    }

    @Override
    public void useSkill() {
        System.out.printf("%s used Slash for %f damage!\n", name, baseDamage * skillMultiplier);
    }

    public void die() {
        System.out.printf("%s: AARRGH!\n", name);
    }
}
