package utils;

public class Counter {
    private int counter;

    public Counter () {
        this.counter = 0;
    }

    public void increase () {
        this.counter++;
    }

    public void print() {
        System.out.println(this.counter);
    }
}
