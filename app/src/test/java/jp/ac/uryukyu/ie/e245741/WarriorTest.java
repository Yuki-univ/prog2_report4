package jp.ac.uryukyu.ie.e245741;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WarriorTest {
    
    @Test
    void attackWithWeponSkillTest(){
        Warrior warrior = new Warrior("demo", 100, 10);
        Enemy enemy = new Enemy("enemy", 100, 1);

        for(int i = 0; i<3; i++){
            int enemy_HP = enemy.getHitPoint();
            warrior.attackWithWeponSkill(enemy);
            assertEquals(warrior.getAttack()*(1.5), enemy_HP - enemy.getHitPoint());
        }

    }
}
