package duck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable gooseDuck = new QuackAdapter(new Goose());

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(redheadDuck);

        Flock flock2 = new Flock();
        flock2.add(duckCall);
        flock2.add(rubberDuck);

        System.out.println("\nDuck Simulator");
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);

        simulate(flock1);
        simulate(flock2);

        System.out.println("Number of quack = " + QuackCounter.getNumOfQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
