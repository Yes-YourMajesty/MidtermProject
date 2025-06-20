public final class Slime extends Character{

    public Slime(String name,int hp){
        this.name=name;
        this.hp=hp;
        System.out.println(this.name + ":HP " + this.hp);
    }
    @Override
    public void attack(Character target) {
        target.hp -= 5;
        System.out.println(this.name + "は体当たり攻撃！" + target.name + "に5のダメージを与えた！");
    }
}
