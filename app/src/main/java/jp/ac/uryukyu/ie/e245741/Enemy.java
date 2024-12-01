package jp.ac.uryukyu.ie.e245741;

public class Enemy extends LivingThing {
    
    public Enemy (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        int currentHP = 0;
        currentHP = this.getHitPoint();
        currentHP -= damage;
        this.setHitPoint(currentHP);

        if( currentHP < 0 ) {
            this.setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", this.getName());
        }
    }
 
}