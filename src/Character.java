public abstract class Character implements Creature {
    String name;
    int hp;
    boolean alive;

    final void isAlive() {
        if(hp > 0) {
            this.alive = true;
        }else{
            this.alive = false;
        }
        System.out.println(this.name + "は生きている: " + this.alive);
    }

    void showStatus(){
        System.out.println(this.name + ":HP " + this.hp);
    }
}
