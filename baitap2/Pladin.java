package baitap2;

public class Pladin implements MagicUser, RangedFighter {
    @Override
    public void castSpell() {
        System.out.println("phap su");
    }

    @Override
    public void attackRanged() {
        System.out.println("can chien bang ten");
    }
}
