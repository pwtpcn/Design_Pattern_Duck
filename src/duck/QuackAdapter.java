package duck;

public class QuackAdapter implements Quackable {
    private Goose goose;

    public QuackAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
