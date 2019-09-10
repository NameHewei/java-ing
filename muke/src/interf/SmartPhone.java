package interf;

public class SmartPhone extends TelPhone implements IPlayGame {
    @Override
    public void call() {
        System.out.println("smart call");
    }

    @Override
    public void playGame() {
        System.out.println("smart play game");

    }
}
