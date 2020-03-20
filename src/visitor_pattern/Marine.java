package visitor_pattern;

public class Marine {

    private double health;

    public Marine(double health) {
        this.health = health;
    }

    public void accept(Visitor visitor) {
        visitor.VisitLight(this);
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
