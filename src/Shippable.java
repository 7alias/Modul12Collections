public interface Shippable<T> {
    void ship(T stuff) throws InterruptedException;
}