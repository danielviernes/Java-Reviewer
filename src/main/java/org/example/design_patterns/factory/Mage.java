package org.example.design_patterns.factory;

import lombok.Data;

public class Mage extends RangedMob {
    Mage(String name) {
        super(name);
        super.baseDamage = 15f;
        super.skillMultiplier = 2.5f;
    }

    public Integer getHealth() {
        return super.baseHealth;
    }

}
