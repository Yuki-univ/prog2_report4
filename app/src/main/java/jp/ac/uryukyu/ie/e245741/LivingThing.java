package jp.ac.uryukyu.ie.e245741;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitpoint, int attack){
        this.name = name;
        this.hitPoint = hitpoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitpoint, attack);
    }

    //getter
    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    //setter
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }



    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if(this.dead == true){
            System.out.println(this.name + "は死んでいる");
        }else{
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, name, damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
