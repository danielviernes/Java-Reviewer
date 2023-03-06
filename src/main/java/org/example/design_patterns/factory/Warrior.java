package org.example.design_patterns.factory;
public class Warrior extends MeleeMob {

    Warrior(String name) {
        super(name);
    }

    public Integer getHealth() {
        return super.baseHealth;
    }

}
