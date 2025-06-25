public class Hero extends Character{
    String weapon;

    Hero(String name,int hp,String weapon){
        this.name=name;
        this.hp=hp;
        this.weapon = weapon;
        System.out.println(this.name + ":HP " + this.hp);
    }

    @Override
    public void attack(Character target){
        target.hp -= 10;
        System.out.println(this.name + "は" + this.weapon + "で攻撃！" + target.name + "に10のダメージを与えた！");
    }

    void heal(){
        this.hp += 20;
        System.out.println(this.name + "は回復呪文を唱えた！HPが20回復した！");
    }
}
