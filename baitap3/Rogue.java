package baitap3;

public class Rogue implements MeleeFighter,MagicUser {
    @Override
    public void attackMelee() {
        System.out.println("Rogue tan cong phat bang cu");
    }
    @Override
    public void castSpell() {
        System.out.println("Rogue dung chung tinh ban minh");
    }
}
