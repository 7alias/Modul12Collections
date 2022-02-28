public class Ship<U> implements Shippable<T>{





    @Override
    public void ship(T stuff) throws InterruptedException {
            stuff.wait(100);
            System.out.println("wait over");
        }}


