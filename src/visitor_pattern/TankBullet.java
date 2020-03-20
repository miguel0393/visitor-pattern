package visitor_pattern;

public class TankBullet implements Visitor {

    @Override
    public void VisitLight(Marine unit) {
        unit.setHealth(unit.getHealth() - 21);
    }

    @Override
    public void VisitArmored(Marauder unit) {
        unit.setHealth(unit.getHealth() - 34);
    }
}
