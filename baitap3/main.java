package baitap3;

public class main {
    public static void main(String[] args) {
        Army army = new Army();
        
        army.addUnit(new Warrior());
        army.addUnit(new Archer());
        army.addUnit(new Mage());
        army.addUnit(new Paladin());
        army.addUnit(new Rogue());

        System.out.println("thuc hien cac cuoc tan cong:");
        army.executeAttack();
    }
    
}
