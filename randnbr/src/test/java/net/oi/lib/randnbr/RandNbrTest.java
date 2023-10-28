package net.oi.lib.randnbr;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class RandNbrTest {

    @Test
    void testRandNbr() {
        RandNbr randNbr = new RandNbr();
        List<Integer> results = new ArrayList<>();

        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));
        results.add(randNbr.randomNumber(1, 10));

        for (Integer i : results) {
            System.out.println(i);
        }
    }

    @Test
    void epochTime() {
        System.out.println(System.currentTimeMillis()/1000);
    }
}
