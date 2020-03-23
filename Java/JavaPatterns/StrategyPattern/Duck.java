package StrategyPattern;

public class Duck {
    FlyBehaviour flyBehaviour;
    SpeakBehaviour speakBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSpeakBehaviour(SpeakBehaviour speakBehaviour) {
        this.speakBehaviour = speakBehaviour;
    }

    public void tryToFly() {
        System.out.println(this.flyBehaviour.canFly());
    }

    public void tryToSpeak() {
        System.out.println(this.speakBehaviour.canSpeak());
    }

}
