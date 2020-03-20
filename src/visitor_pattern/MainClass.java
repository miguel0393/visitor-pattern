package visitor_pattern;

public class MainClass {

    public static void main(String[] args) {

        final Marauder marauder = new Marauder(125d);
        final Marine marine = new Marine(100d);

        final Visitor visitor = new TankBullet();

        System.err.println("--------------------------------------------------------------------");
        System.err.println("Marauder initial health: " + marauder.getHealth());
        marauder.accept(visitor);
        System.err.println("Marauder health after tank bullet attack: " + marauder.getHealth());


    }
}
