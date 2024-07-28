//6510450437 Thanapoom Chaisena
package duck;

public class Polite implements Quackable{
    Quackable duck;

    public Polite(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.println("Kub");
    }
}
