package org.example.design_patterns.factory;

import lombok.Data;

public class Archer extends RangedMob {
    Archer(String name) {
        super(name);
    }

    public Integer getHealth() {
        return super.baseHealth;
    }
}
