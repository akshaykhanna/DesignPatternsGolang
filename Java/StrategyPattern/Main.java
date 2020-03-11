public class Main {

    public static void main(String[] args) {
        System.out.println("---------- Strategy Pattern ---------");
        Duck myWildDuck = new WildDuck();
        myWildDuck.tryToFly();
        myWildDuck.tryToSpeak();
        Duck myRuberDuck = new RubberDuck();
        myRuberDuck.tryToFly();
        myRuberDuck.tryToSpeak();
    }
}
