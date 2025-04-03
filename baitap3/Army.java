package baitap3;
import java.util.ArrayList;
import java.util.List;

class Army {
    private final List<Object> soldiers = new ArrayList<>();

    public void addUnit(Object unit) {
        soldiers.add(unit);
    }

    public void executeAttack() {
        for (Object unit : soldiers) {
            if (unit instanceof MeleeFighter) {
                ((MeleeFighter) unit).attackMelee();
            }
            if (unit instanceof RangedFighter) {
                ((RangedFighter) unit).attackRanged();
            }
            if (unit instanceof MagicUser) {
                ((MagicUser) unit).castSpell();
            }
        }
    }
}