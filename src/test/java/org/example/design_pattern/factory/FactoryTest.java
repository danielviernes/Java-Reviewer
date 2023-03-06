package org.example.design_pattern.factory;

import org.example.design_patterns.factory.*;
import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void testFactory_warrior_success() {
        Mob mob = MobFactory.createMob(MobEnums.WARRIOR, "Warrio");
        Warrior warriorTest = (Warrior) mob;
        System.out.printf("Health: %d\n", warriorTest.getHealth());
        warriorTest.attack();
        warriorTest.useSkill();
        warriorTest.die();
        Assert.assertTrue(mob instanceof Warrior);
    }

    @Test
    public void testFactory_archer_success() {
        Mob mob = MobFactory.createMob(MobEnums.ARCHER, "Archie");
        Archer archerTest = (Archer) mob;
        System.out.printf("Health: %d\n", archerTest.getHealth());
        archerTest.attack();
        archerTest.useSkill();
        archerTest.die();
        Assert.assertTrue(mob instanceof Archer);
    }

    @Test
    public void testFactory_mage_success() {
        Mob mob = MobFactory.createMob(MobEnums.MAGE, "Magus");
        Mage mageTest = (Mage) mob;
        System.out.printf("Health: %d\n", mageTest.getHealth());
        mageTest.attack();
        mageTest.useSkill();
        mageTest.die();
        Assert.assertTrue(mob instanceof Mage);
    }

}
