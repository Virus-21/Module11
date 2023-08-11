package Task4;

import java.util.concurrent.atomic.AtomicLong;

public class RandomAlg {

    private long a, c, m;
    private AtomicLong x;

    public RandomAlg() {
        this.a = 25214903917l;
        this.m = (long) Math.pow(48,2);
    }

    public RandomAlg withSeed(long c) {
        this.c = c;
        x = new AtomicLong(c);
        return this;
    }

    public int next() {
        return (int) ((int) (a * x.incrementAndGet() + c) % m);
    }
}