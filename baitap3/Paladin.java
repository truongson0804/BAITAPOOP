package baitap3;

public class Paladin implements MeleeFighter ,MagicUser {
    @Override
    public void attackMelee() {
        System.out.println("Paladin dang tan cong bang vu khi");
    }
    @Override
    public void castSpell() {
        System.out.println("Paladin dang niem chieu");
    }
}
