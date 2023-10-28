package net.oi.lib.randnbr;

import java.util.Random;

public class RandNbr 
{
    private Random random;

    public RandNbr() {
        random = new Random(System.currentTimeMillis()/1000);
    }

    public RandNbr(long seed) {
        random = new Random(seed);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int randomNumber(int a, int b) {
        return random.nextInt((b - a) + 1) + a;
    }
}
