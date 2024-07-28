package duck;

public class PoliteAndCountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new Polite(new DuckCall()));
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new Polite(new MallardDuck()));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new Polite(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new Polite(new RubberDuck()));
    }
}
