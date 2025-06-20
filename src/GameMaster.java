public class GameMaster {
    public static void main(String[] args) {
        Hero h1 = new Hero("アベル",100,"銅の剣");
        Slime s1 =new Slime("スライムA",30);

        System.out.println("冒険が始まる…！");
        h1.showStatus();
        s1.showStatus();
        System.out.println("戦闘開始！");
        h1.attack(s1);
        h1.showStatus();
        s1.attack(h1);
        h1.showStatus();
        h1.heal();
        h1.showStatus();
        h1.attack(s1);
        h1.attack(s1);
        h1.attack(s1);
        System.out.println("--- 戦闘終了 ---");
        System.out.println("最終ステータス:");
        h1.showStatus();
        s1.showStatus();
        h1.isAlive();
        s1.isAlive();
        System.out.println("--- 参照の確認 ---");
    }
}
