public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.FIREARMS, "Kanareyka 6G17");

        Boss boss = new Boss(200, 1200, weapon);
        System.out.println(boss.info());

    }
}