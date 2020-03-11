public class Duck {
    FlyBehaviour flyBehaviour;
    SpeakBehaviour speakBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setSpeakBehaviour(SpeakBehaviour speakBehaviour) {
        this.speakBehaviour = speakBehaviour;
    }

    void tryToFly() {
        System.out.println(this.flyBehaviour.canFly());
    }

    void tryToSpeak() {
        System.out.println(this.speakBehaviour.canSpeak());
    }

}
