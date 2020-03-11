public class WildDuck extends Duck {
    public WildDuck() {
        System.out.println("I am a wild duck");
        this.setFlyBehaviour(new ItFlys());
        this.setSpeakBehaviour(new SaysQuak());
    }
}
