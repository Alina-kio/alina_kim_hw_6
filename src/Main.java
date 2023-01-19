public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.FIREARMS, "Kanareyka 6G17");

        Boss boss = new Boss(200, 1200, weapon);
        System.out.println(boss.info());


        Skeleton skeleton = new Skeleton(250, 980, weapon, 8);
        Skeleton skeleton1 = new Skeleton(300, 1509, weapon, 16);
        System.out.println();
        System.out.println(skeleton.info());
        System.out.println();
        System.out.println(skeleton1.info());

    }
}