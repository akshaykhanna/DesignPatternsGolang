package StrategyPattern;

public class SaysQuak implements SpeakBehaviour {
    @Override
    public String canSpeak() {
        return "Says Quak Quak !!!";
    }
}
