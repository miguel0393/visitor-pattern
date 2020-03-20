package visitor_pattern;

public interface Visitor {

    void VisitLight(Marine unit);
    void VisitArmored(Marauder unit);

}
