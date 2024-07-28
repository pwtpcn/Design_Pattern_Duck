//6510450437 Thanapoom Chaisena
package duck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory duckCountingFactory = new CountingDuckFactory();
        AbstractDuckFactory duckCountPoliteFactory = new PoliteAndCountingDuckFactory();

        simulator.simulate(duckCountPoliteFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable gooseDuck = new QuackAdapter(new Goose());
        Quackable pigeon = new PigeonAdaptor(new Pigeon());

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redheadDuck);
        flock1.add(duckCall);
        flock1.add(rubberDuck);

        System.out.println("\nDuck Simulator");
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);

        simulate(flock1);

        System.out.println("Number of quack = " + QuackCounter.getNumOfQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
