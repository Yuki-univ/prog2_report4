package jp.ac.uryukyu.ie.e245741;


public class Hero extends LivingThing {
    
    public Hero (String name, int hitpoint, int attack) {
        super(name, hitpoint, attack);  //書き方違うかも。あとで調べて。
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", this.getName());
        }
    }

}