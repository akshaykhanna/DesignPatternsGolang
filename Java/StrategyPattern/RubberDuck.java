public class RubberDuck extends Duck {
    public RubberDuck() {
        System.out.println("I am rubber duck");
        this.setFlyBehaviour(new CantFly());
        this.setSpeakBehaviour(new SaysPichku());
    }
}
