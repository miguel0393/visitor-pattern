package visitor_pattern;

public class Marauder {

    private double health;

    public Marauder(double health) {
        this.health = health;
    }

    public void accept(Visitor visitor) {
        visitor.VisitArmored(this);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
