package CS390Assignment3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prog1Test {

    @Test
    void power() {
        Prog1 p1 = new Prog1();

        double calling = p1.power(2,3);
        double checking = 4.0;

        assertEquals(checking,calling);
    }

}