package jp.ac.uryukyu.ie.e245741;

public class Warrior extends Hero {
    
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        int damage = (int)(this.getAttack()*(1.5));
        if(this.isDead() == true){
            System.out.println(this.getName() + "は死んでいる");
        }else{
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.getName(), opponent.getName(), damage);
            opponent.wounded(damage);

        }
    }
}
